package com.unibe.Examen.Aplicaciones.profesor.service.impl;

import com.unibe.Examen.Aplicaciones.profesor.entity.Profesor;
import com.unibe.Examen.Aplicaciones.profesor.repository.ProfesorRepository;
import com.unibe.Examen.Aplicaciones.profesor.service.IProfesorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfesorServiceImpl implements IProfesorService {

    private final ProfesorRepository repository;

    @Override
    public List<Profesor> getAll() {
        return repository.findAll();
    }

    @Override
    public Profesor getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Profesor no encontrado con id: " + id));
    }

    @Override
    public Profesor create(Profesor profesor) {
        return repository.save(profesor);
    }
}
