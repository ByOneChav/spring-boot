package com.example.spring.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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

    @ModelAttribute("Empleados")
    public List<Empleado> ListaEmpleados(){
        return Arrays.asList(new Empleado("Maria", "Perez", "Calle segundo n.2", "Secretaria", 21, 98788772, 02),
          new Empleado("María", "Perez", "Calle segunda no.2", "Secretaria", 20, 123654987, 02),
          new Empleado("Juan", "Rodriguez", "Calle primera no.1", "Gerente", 35, 123456789, 01),
          new Empleado("Luis", "Martínez", "Calle tercera no.3", "Contador", 28, 987654321, 03),
          new Empleado("Ana", "González", "Avenida central no.4", "Diseñadora", 30, 456789123, 04),
          new Empleado("Pedro", "Sánchez", "Boulevard no.5", "Analista", 25, 789123456, 05));
    }

}
