package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     // añadir mínimo 3 atributos (ejemplo: fecha, horaInicio, horaFin, aulaId)
    private Long id;
    private LocalDate fecha;
    private LocalTime horaIncio;
    private LocalTime horaFin;
    private Aula aulaId;

   
    // TODO: constructor con parámetros
    public reserva(){}
    public reserva(Long id, LocalDate fecha, LocalTime horaIncio, LocalTime horaFin, Aula aulaId){
        this.id=id;
        this.fecha=fecha;
        this.horaIncio=horaIncio;
        this.horaFin=horaFin;
        this.aulaId=aulaId;
    }

    //agregamos getters y setters
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public LocalDate getFecha(){
        return fecha;
    }
    public void setFecha(LocalDate fecha){
        this.fecha;
    }

    public LocalTime getHoraInicio(){
        return horaIncio;
    }
    public void setHoraInicio(LocalTime horaIncio){
        this.horaIncio=horaIncio;
    }

    public LocalTime getHoraFin(){
        return horaFin;
    }
    public void setHoraFin(LocalTime horaFin){
        this.horaFin=horaFin;
    }

    public Aula getAulaId(){
        return aulaId;
    }
    public void setAulaID(Aula aulaId){
        this.aulaId=aulaId;
    }
}
