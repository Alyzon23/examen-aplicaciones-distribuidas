package com.unibe.Examen.Aplicaciones.profesor.repository;

import com.unibe.Examen.Aplicaciones.profesor.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}
