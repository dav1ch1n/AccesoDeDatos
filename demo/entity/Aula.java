package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Aula {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   // añadir mínimo 3 atributos (ejemplo: nombre, capacidad, edificio)
    private Long id;
    private String nombre;
    private int capacidad;
    private String edificio;

    // ahora agregamos los getter y setters
    public Long getID(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

     public String getNombre (){
        return nombre;
    }
    public void (String nombre){
        this.nombre=nombre;
    }

     public int getCapacidad(){
        return capacidad;
    }
    public void setCapacidad(int capacidad){
        this.capacidad=capacidad;
    }

     public String getEdificio (){
        return edificio;
    }
    public void setEdificio(String edificio){
        this.edificio=edificio;
    }



  
}
