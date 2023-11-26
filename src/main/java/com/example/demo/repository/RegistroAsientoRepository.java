package com.example.demo.repository;


import com.example.demo.model.bd.RegistroAsiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroAsientoRepository extends JpaRepository<RegistroAsiento,
        Integer> {


}
