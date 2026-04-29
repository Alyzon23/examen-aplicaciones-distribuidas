package com.unibe.Examen.Aplicaciones.curso.service.impl;

import com.unibe.Examen.Aplicaciones.curso.entity.Curso;
import com.unibe.Examen.Aplicaciones.curso.repository.CursoRepository;
import com.unibe.Examen.Aplicaciones.curso.service.ICursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoServiceImpl implements ICursoService {

    private final CursoRepository repository;

    @Override
    public Page<Curso> getAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Curso getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado con id: " + id));
    }

    @Override
    public List<Curso> getByNombre(String nombre) {
        return repository.findByNombreContainingIgnoreCase(nombre);
    }

    @Override
    public Curso create(Curso curso) {
        return repository.save(curso);
    }

    @Override
    public Curso updateFull(Long id, Curso curso) {
        Curso existing = getById(id);
        existing.setNombre(curso.getNombre());
        existing.setDescripcion(curso.getDescripcion());
        existing.setActivo(curso.getActivo());
        return repository.save(existing);
    }

    @Override
    public Curso updatePartial(Long id, Curso curso) {
        Curso existing = getById(id);
        if (curso.getNombre() != null) existing.setNombre(curso.getNombre());
        if (curso.getDescripcion() != null) existing.setDescripcion(curso.getDescripcion());
        if (curso.getActivo() != null) existing.setActivo(curso.getActivo());
        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.delete(getById(id));
    }
}
