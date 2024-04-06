package hn.unah.lenguajes1900.examen.demo.services;

import java.util.List;
import java.util.Optional;

import hn.unah.lenguajes1900.examen.demo.entities.Cliente;

public interface ClienteService {
     public Cliente creaCliente(Cliente cliente);

    public List<Cliente> obtenerClientes();

    public Optional<Cliente> buscarClientePorId(String dni);

}
