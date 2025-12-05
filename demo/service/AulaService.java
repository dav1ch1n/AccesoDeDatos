package com.example.demo.service;

import com.example.demo.entity.Aula;
import com.example.demo.repository.AulaRepository;

import java.util.List;

@Service
public interface AulaService {
    @AutoWires
    private AulaRepository aulRepository;

    public List<Aula> getAll(){ //aqui hago una lista de la tabla aula para que `pueda sacar todos los valores que tenga la tabla con el findAll()
        return aulRepository.findAll();
    }
    // recoger una reserva.
    public Aula getOne(Long id){ //el findOn(id) encuentra en la tabla la fila que tenga ese id y el orElse hace que saque valores aunque tenga null
        return aulRepository.finOne(id).orElse(null)
    }
    // Guardar una reserva --Se debe validar horas
    public Aula insert(Aula aul){ //con el save() guardamos los valores que insertamos o actualizamos.
        return aulRepository.save(aul);
    }
    // Cambiar una reserva.
    public Aula update(Long id, Aula aul){ //aqui metemos los valores que queremos actualizar, 
        Aula aula = getById(id);
        aula.setNombre(aul.getNombre());
        aula.setCapacidad(aul.getCapacidad());
        aula.setEdificio(aul.getEdificio());
        
        return aulRepository.save(aula);
    }
    // Borrar una reserva.
    public void delete(Long id){ //con el deleteById borramos la fila del id seleccionado. Hay que tener cuidado con que ID borramos
        return aulRepository.deleteById(id);
    }
}
