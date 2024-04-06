package hn.unah.lenguajes1900.examen.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.examen.demo.entities.Cliente;
import hn.unah.lenguajes1900.examen.demo.services.impl.ClienteServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class ClienteControllers {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @GetMapping("/obtener/clientes")
    public List<Cliente> obtenerClientes() {
        return this.clienteServiceImpl.obtenerClientes();
    }

    @GetMapping("/buscar/cliente")
    public Optional<Cliente> obtenerPorId(@RequestParam String dni) {
        return this.clienteServiceImpl.buscarClientePorId(dni);
    }



    
}
