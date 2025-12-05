package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Aula;
import com.example.demo.service.AulaService;

import java.util.List;

@RestController
@RequestMapping("/Aula")
public class AulaController {

    private final AulaService aulaService;

    public AulaController(AulaService aulaService) {
        this.aulaService = aulaService;
    }

  // Devolver todas las aulas
  @GetMapping
  public List<Aula> ListaCompleta(){
    return aulaService.getAll();
  }
  // Devolver un aula 
  @GetMapping("/{id}")
  public Aula getAulaId(@PathVariable Long id){
    return aulaService.getOne(id);
  }
  // añadir aula -- no se debe repetir

  // modificar aula
  
  // borrar aula
  @DeleteMapping("/{id}")
  public void borrar(@PathVariable Long id){
    aulaService.delete(id);
  }
}
