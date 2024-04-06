package hn.unah.lenguajes1900.examen.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.examen.demo.entities.Cliente;
import hn.unah.lenguajes1900.examen.demo.repositories.ClienteRepository;
import hn.unah.lenguajes1900.examen.demo.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{


    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente creaCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    
        
    }

    

    @Override
    public List<Cliente> obtenerClientes() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> buscarClientePorId(String dni) {
        return this.clienteRepository.findById(dni); 
        
    }

    
}
