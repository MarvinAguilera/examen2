package hn.unah.lenguajes1900.examen.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dni")
    private String dni;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    
   @OneToOne 
   @JoinColumn(name = "direccion", referencedColumnName = "direccion")
   private Direccion direccion;
   
   @OneToMany
   @JoinColumn(name = "cuentas", referencedColumnName = "cuentas")
   private Cuentas cuentas;

}
