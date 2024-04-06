package hn.unah.lenguajes1900.examen.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import hn.unah.lenguajes1900.examen.demo.entities.Direccion;
import hn.unah.lenguajes1900.examen.demo.services.impl.DireccionServiceImpl;

@RestController
@RequestMapping("/api")
public class DireccionController {
    
    @Autowired
    private DireccionServiceImpl direccionServiceImpl;

    @PostMapping("/crear/direccion")
    public Direccion crearDireccion(@RequestBody Direccion direccion) {
        return this.clienteServiceImpl.crearDireccion(direccion);
    }

}
