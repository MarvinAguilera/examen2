package hn.unah.lenguajes1900.examen.demo.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cuentas")
@Data
public class Cuentas {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "numerocuenta")
   private String numeroCuenta;

   private double saldo;
   @Column(name = "fechaapertura")
   private LocalDate fechaApertura;

   private boolean estado;
   private boolean sobregiro;
   
   @ManyToOne
   @JoinColumn(name = "cliente", referencedColumnName = "cliente")
   private List<Cliente> cliente;
}
