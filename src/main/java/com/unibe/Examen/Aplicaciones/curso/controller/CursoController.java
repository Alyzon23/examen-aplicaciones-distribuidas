package com.unibe.Examen.Aplicaciones.curso.controller;

import com.unibe.Examen.Aplicaciones.curso.entity.Curso;
import com.unibe.Examen.Aplicaciones.curso.service.ICursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
@RequiredArgsConstructor
public class CursoController {

    private final ICursoService service;

    @GetMapping
    public Page<Curso> getAll(Pageable pageable) {
        return service.getAll(pageable);
    }

    @GetMapping("/{id}")
    public Curso getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/buscar")
    public List<Curso> getByNombre(@RequestParam String nombre) {
        return service.getByNombre(nombre);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Curso create(@RequestBody Curso curso) {
        return service.create(curso);
    }

    @PutMapping("/{id}")
    public Curso updateFull(@PathVariable Long id, @RequestBody Curso curso) {
        return service.updateFull(id, curso);
    }

    @PatchMapping("/{id}")
    public Curso updatePartial(@PathVariable Long id, @RequestBody Curso curso) {
        return service.updatePartial(id, curso);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
