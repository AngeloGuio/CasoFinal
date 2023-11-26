package com.example.demo.controller.frontoffice;

import com.example.demo.model.bd.Usuario;
import com.example.demo.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/auth")
public class LoginController {

        private UsuarioService usuarioService;
        @GetMapping("/login")
        public String login(){
            return "frontoffice/auth/login";
        }
        @GetMapping("/registrar")
        public String registro(){
            return "frontoffice/auth/registro";
        }
        @PostMapping("/guardarusuario")
        public String guardarUsuario(@ModelAttribute Usuario usuario){
           // usuarioService.saveUser(usuario);
            return "frontoffice/auth/login";
        }

        @GetMapping("/login-success")
        public String loginsuccess(){
            return "frontoffice/auth/dashboard";
        }
}
