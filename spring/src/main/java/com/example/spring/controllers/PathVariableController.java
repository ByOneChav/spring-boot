package com.example.spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.models.Empleado;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/variable")
public class PathVariableController {

    //http://localhost:8080/api/variable/pagina1/Hola%20Kast
    @GetMapping("/pagina1/{mensaje}")
    public ParametroDTO pagina1(@PathVariable String mensaje){
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(mensaje);
        return parametro1;
    }

    @PostMapping("/solicitud")
    public Empleado creaEmpleado(@RequestBody Empleado empleado1){
        return empleado1;
    }
    
    
   
    

}
