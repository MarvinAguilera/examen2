package hn.unah.lenguajes1900.examen.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes1900.examen.demo.entities.Direccion;

public interface DireccionRepository extends CrudRepository<Direccion, Long> {
    
}
