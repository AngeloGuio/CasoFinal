package com.example.demo.service;


import com.example.demo.model.bd.AsientoCliente;
import com.example.demo.model.bd.RegistroAsiento;
import com.example.demo.model.response.ResultadoResponse;
import com.example.demo.repository.AsientoClienteRepository;
import com.example.demo.repository.RegistroAsientoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@AllArgsConstructor
public class AsientoClienteService {

    private AsientoClienteRepository asientoClienteRepository;
    private RegistroAsientoRepository registroAsientoRepository;

    @Transactional(propagation = Propagation.REQUIRES_NEW,
    isolation = Isolation.READ_COMMITTED)
    public ResultadoResponse registrarAsientoCliente(
            RegistroAsiento registroAsiento,
            List<AsientoCliente> asientoClienteLis){

        RegistroAsiento nuevoRegistroAsiento =
                registroAsientoRepository.save(registroAsiento);

        for (AsientoCliente asiento: asientoClienteLis){
            asiento.setIdacliente(nuevoRegistroAsiento.getIdrasiento());
            asientoClienteRepository.save(asiento);
        }

        return null;
    }
}
