package com.example.demo.controller.administracion;

import com.example.demo.model.bd.Sala;
import com.example.demo.model.dto.request.SalaDto;
import com.example.demo.model.response.ResultadoResponse;
import com.example.demo.service.SalaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@Controller
@RequestMapping("/administracion/sala")
public class SalaController {
    private SalaService salaService;
    @GetMapping("/frmSala")
    public String frmSala(Model model){
        model.addAttribute("listasalas",
                salaService.listarSalas());
        return "administracion/frmSala";
    }
    @PostMapping("/registrar")
    @ResponseBody
    public ResultadoResponse registrarSala(@RequestBody SalaDto salaDto){
        return salaService.guardarActualizarSala(salaDto);
    }
    @GetMapping("/listar")
    @ResponseBody
    public List<Sala> listarSalas(){
        return salaService.listarSalas();
    }


}
