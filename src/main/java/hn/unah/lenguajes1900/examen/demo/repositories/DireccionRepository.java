package hn.unah.lenguajes1900.examen.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.examen.demo.entities.Direccion;

@Repository
public interface DireccionRepository extends CrudRepository<Direccion, Long> {
    
}
