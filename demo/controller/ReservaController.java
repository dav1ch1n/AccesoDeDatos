package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

  // Devolver todas las reserva
  // Devolver un reserva 
  // añadir reserva -- no se debe repetir
  // modificar reserva
  // borrarreserva
}
