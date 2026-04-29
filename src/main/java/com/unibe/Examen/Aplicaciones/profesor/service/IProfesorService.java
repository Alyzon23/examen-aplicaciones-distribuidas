package com.unibe.Examen.Aplicaciones.profesor.service;

import com.unibe.Examen.Aplicaciones.profesor.entity.Profesor;

import java.util.List;

public interface IProfesorService {
    List<Profesor> getAll();
    Profesor getById(Long id);
    Profesor create(Profesor profesor);
}
