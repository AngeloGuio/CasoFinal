package com.example.demo.controller.administracion;

import com.example.demo.model.bd.Estado;
import com.example.demo.model.response.ResultadoResponse;
import com.example.demo.service.EstadoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/administracion/estado")
public class EstadoController {

    private EstadoService estadoService;

    @GetMapping("/frmEstado")
    public String frmEstado(Model model){
        model.addAttribute("listaestados", estadoService.listarEstados());
        return "administracion/frmEstado";
    }

    @PostMapping("/registrar")
    @ResponseBody
    public ResultadoResponse registrarEstado(@RequestBody Estado objEstado){
        return estadoService.registrarEstado(objEstado);
    }
    @GetMapping("/listar")
    @ResponseBody
    public List<Estado> listarEstados(){
        return estadoService.listarEstados();
    }
    @DeleteMapping("/eliminar")
    @ResponseBody
    public ResultadoResponse eliminarEstado(@RequestBody Estado objEstado){
        return estadoService.eliminarEstado(objEstado.getIdestado());
    }

}
