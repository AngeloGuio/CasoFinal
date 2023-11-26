package com.example.demo.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "asientocliente")
public class AsientoCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idacliente;
    @Column(name = "idrasiento")
    private Integer idrasiento;
    @Column (name = "idcliente")
    private Integer idcliente;
}
