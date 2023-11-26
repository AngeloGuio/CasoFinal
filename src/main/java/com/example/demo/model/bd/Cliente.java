package com.example.demo.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcliente;
    @Column(name = "nomcliente")
    private String nomcliente;
    @Column(name = "apellidos")
    private String apecliente;
    @Column(name = "dnicliente")
    private  String dnicliente;

}
