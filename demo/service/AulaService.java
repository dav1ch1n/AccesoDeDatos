package com.example.demo.service;

import com.example.demo.entity.Aula;
import com.example.demo.repository.AulaRepository;

import java.util.List;

public interface AulaService {
    public List<Aula> getAll(){

    }
    // recoger una reserva.
    public Aula getOne(Long id){

    }
    // Guardar una reserva --Se debe validar horas
    public Aula insert(Aula aul){

    }
    // Cambiar una reserva.
    public Aula update(Aula aul){

    }
    // Borrar una reserva.
    public void delete(Long id){

    }
}
