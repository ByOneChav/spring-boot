package com.example.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.spring.models.Empleado;




@Controller
public class EjemploController {

    // http://localhost:8080/detalles_info
    @GetMapping("/detalles_info")

    // metodo Handler
    public String info(Model model){
        Empleado empleado1 = new Empleado("Onega", "Chavarria", "av Lastarria 943", "Developer", 28, 940673637, 01);
        model.addAttribute("Empleado", empleado1);
        return "detalles_info";
    }

}
