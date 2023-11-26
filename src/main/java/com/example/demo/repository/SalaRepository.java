package com.example.demo.repository;


import com.example.demo.model.bd.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SalaRepository
        extends JpaRepository<Sala, Integer> {

}
