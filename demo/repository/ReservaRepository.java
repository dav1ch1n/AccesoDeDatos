package com.example.demo.repository;

import com.example.demo.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    // Recoger todas las reservas.
    public List<Reserva> getAll();
    // recoger una reserva.
    public Reserva getOne(Long id);
    // Guardar una reserva --Se debe validar horas
    public Reserva insert(Reserva res);
    // Cambiar una reserva.
    public Reserva update(Reserva res);
    // Borrar una reserva.
    public void delete(Long id);
}
