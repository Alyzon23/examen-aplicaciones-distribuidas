package com.unibe.Examen.Aplicaciones.profesor.controller;

import com.unibe.Examen.Aplicaciones.profesor.entity.Profesor;
import com.unibe.Examen.Aplicaciones.profesor.service.IProfesorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
@RequiredArgsConstructor
public class ProfesorController {

    private final IProfesorService service;

    @GetMapping
    public List<Profesor> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Profesor getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Profesor create(@RequestBody Profesor profesor) {
        return service.create(profesor);
    }
}
