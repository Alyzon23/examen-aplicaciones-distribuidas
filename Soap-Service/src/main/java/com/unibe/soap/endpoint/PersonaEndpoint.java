package com.unibe.soap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.unibe.soap.personas.GetPersonaRequest;
import com.unibe.soap.personas.GetPersonaResponse;

@Endpoint
public class PersonaEndpoint {

    private static final String NAMESPACE = "http://unibe.com/soap/personas";

    @PayloadRoot(namespace = NAMESPACE, localPart = "getPersonaRequest")
    @ResponsePayload
    public GetPersonaResponse getPersona(@RequestPayload GetPersonaRequest request) {
        GetPersonaResponse response = new GetPersonaResponse();
        response.setNombre(request.getNombre());
        response.setEdad(25);
        response.setCorreo(request.getNombre().toLowerCase() + "@unibe.edu.ec");
        return response;
    }
}
