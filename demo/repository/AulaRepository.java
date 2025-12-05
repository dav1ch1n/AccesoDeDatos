package com.example.demo.repository;

import com.example.demo.entity.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Long> {
    // Recoger todas las reservas.
    public List<Aula> getAll();
    // recoger una reserva.
    public Aula getOne(Long id);
    // Guardar una reserva --Se debe validar horas
    public Aula insert(Aula aul);
    // Cambiar una reserva.
    public Aula update(Aula aul);
    // Borrar una reserva.
    public void delete(Long id);

}
