package com.unibe.soap.personas;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getPersonaRequest", namespace = "http://unibe.com/soap/personas")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetPersonaRequest {

    @XmlElement(namespace = "http://unibe.com/soap/personas")
    private String nombre;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
