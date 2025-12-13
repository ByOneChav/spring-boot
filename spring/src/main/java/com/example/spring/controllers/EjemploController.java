package com.example.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// http://localhost:8080/detalles_info

@Controller
public class EjemploController {

    
    @GetMapping("/detalles_info")

    // metodo Handler
    public String info(){

        return "detalles_info";
    }

}
