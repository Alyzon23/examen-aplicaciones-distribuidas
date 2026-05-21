package com.unibe.soap.personas;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getPersonaResponse", namespace = "http://unibe.com/soap/personas")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetPersonaResponse {

    @XmlElement(namespace = "http://unibe.com/soap/personas")
    private String nombre;

    @XmlElement(namespace = "http://unibe.com/soap/personas")
    private int edad;

    @XmlElement(namespace = "http://unibe.com/soap/personas")
    private String correo;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
}
