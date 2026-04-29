package com.unibe.Examen.Aplicaciones.curso.service;

import com.unibe.Examen.Aplicaciones.curso.entity.Curso;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICursoService {
    Page<Curso> getAll(Pageable pageable);
    Curso getById(Long id);
    List<Curso> getByNombre(String nombre);
    Curso create(Curso curso);
    Curso updateFull(Long id, Curso curso);
    Curso updatePartial(Long id, Curso curso);
    void delete(Long id);
}
