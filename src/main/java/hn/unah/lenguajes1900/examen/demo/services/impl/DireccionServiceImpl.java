package hn.unah.lenguajes1900.examen.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.examen.demo.entities.Direccion;
import hn.unah.lenguajes1900.examen.demo.repositories.DireccionRepository;
import hn.unah.lenguajes1900.examen.demo.services.DireccionService;

@Service
public class DireccionServiceImpl implements DireccionService{


    @Autowired
    private DireccionRepository direccionRepository;

    @Override
    public Direccion crearDireccion(Direccion direccion) {
        return this.direccionRepository.save(direccion);
    }
    


}
