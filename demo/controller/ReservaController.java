package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Reserva;
import com.example.demo.service.ReservaService;

import java.util.List;

@RestController
@RequestMapping("/Reserva")
public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

  // Devolver todas las reserva
  @GetMapping
  public List<Reserva> ListaCompleta(){
    return reservaService.getAll();
  }
  // Devolver un reserva 
  @GetMapping("/{id}")
  public Reserva getReservaId(@PathVariable Long id){
    return reservaService.getOne(id);
  }
  // añadir reserva -- no se debe repetir

  // modificar reserva

  // borrarreserva
  @DeleteMapping("/{id}")
  public void borrar(@PathVariable Long id){
    reservaService.delete(id);
  }
}
