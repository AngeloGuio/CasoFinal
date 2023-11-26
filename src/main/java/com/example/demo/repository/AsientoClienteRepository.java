package com.example.demo.repository;


import com.example.demo.model.bd.AsientoCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AsientoClienteRepository extends JpaRepository<AsientoCliente,
        Integer> {

    /*
    @Transactional // solo para procedimientos almacenados que utilizan insert, update y delete
    @Modifying // solo para procedimentos almacenados q utilizan insert, update o delete
    @Query(value = "{call spRegistrarTransaccion(:idregistro, :idcliente)}",
            nativeQuery = true)
    void registrarTransaccion(@Param("idregistro")Integer idregistro,
                             @Param("idlciente") Integer idcliente);

     */


}
