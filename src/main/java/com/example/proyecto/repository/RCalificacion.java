package com.example.proyecto.repository;

import com.example.proyecto.entity.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCalificacion extends JpaRepository<Calificacion, Long> {
}

