package com.example.demo.service;

import com.example.demo.entity.Reserva;
import com.example.demo.repository.ReservaRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public interface ReservaService {
    @AutoWires
    private ReservaRepository resRepository;

    public List<Reserva> getAll(){
        return resRepository.findAll();
    }
    // recoger una reserva.
    public Reserva getOne(Long id){
        return resRepository.finOne(id).orElse(null)
    }
    // Guardar una reserva --Se debe validar horas
    public Reserva insert(Reserva res){
        LocalTime actual;
        res = new Reserva();

        res.setFecha("");
        res.setHoraInicio("");
        if (res.getHoraInicio() <= actual.now()){
            System.out.println("La hora no está disponible para hoy.")
            res.setHoraInicio(null);
        }
        else {
            res.setHoraInicio("");
        }
        res.setHoraFin("");
        res.setAulaID("");

        return resRepository.save(res);
    }
    // Cambiar una reserva.
    public Reserva update(Long id, Aula res){
        Reserva reserva = getById(id);
        reserva.setFecha(res.getFecha());
        reserva.setHoraInicio(res.getHoraInicio());
        reserva.setHoraFin(res.getHoraFin());

        return resRepository.save(res);
    }
    // Borrar una reserva.
    public void delete(Long id){
        return resRepository.deleteById(id);
    }
}
