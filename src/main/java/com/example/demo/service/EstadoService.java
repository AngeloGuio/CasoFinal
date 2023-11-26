package com.example.demo.service;

import com.example.demo.model.bd.Estado;
import com.example.demo.model.response.ResultadoResponse;
import com.example.demo.repository.EstadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EstadoService {

    private EstadoRepository estadoRepository;

    public List<Estado> listarEstados(){
        return estadoRepository.findAll();
    }

    public ResultadoResponse registrarEstado(Estado estado){
        boolean respuesta = true;
        String mensaje = "Estado registrado correctamente";
        if(estado.getIdestado().equals(0)){
            estado.setIdestado(null);
        }
        try{
            estadoRepository.save(estado);
        }catch (Exception ex){
            respuesta = false;
            mensaje = "Estado NO registrado";
        }
        return ResultadoResponse.builder()
                .respuesta(respuesta)
                .mensaje(mensaje).build();
    }

    public ResultadoResponse eliminarEstado(Integer idestado){
        boolean respuesta = true;
        String mensaje = "Estado eliminado correctamente";
        try{
            estadoRepository.deleteById(idestado);
        }catch (Exception ex){
            respuesta = false;
            mensaje = "Estado NO eliminado";
        }
        return ResultadoResponse.builder()
                .respuesta(respuesta)
                .mensaje(mensaje).build();
    }



}
