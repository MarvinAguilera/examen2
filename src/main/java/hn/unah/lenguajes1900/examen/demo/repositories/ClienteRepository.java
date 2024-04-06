package hn.unah.lenguajes1900.examen.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes1900.examen.demo.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String> {
    
}
