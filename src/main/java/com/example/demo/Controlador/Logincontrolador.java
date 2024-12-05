/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controlador;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author User
 */
@Controller

public class Logincontrolador {
 
    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; 
    }
 
    @PostMapping("/login")
    public String processLogin(@RequestParam("username") String username,
                               @RequestParam("password") String password, 
                               Model model) {
        if ("admin".equals(username) && "admin".equals(password)) {
            model.addAttribute("message", "Login exitoso, bienvenido!");
            return "success"; // Redirige a la página de éxito
        } else {
            model.addAttribute("error", "Credenciales incorrectas, intente de nuevo.");
            return "login"; // Redirige al formulario de login con error
        }
    }
}

