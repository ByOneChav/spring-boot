package com.example.spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/parametros")
public class RequestParamControllers {

    //http://localhost:8080/api/parametros/detalle?informacion=Saludo%20a%20todos
    @GetMapping("/detalle")
    public ParametroDTO detalle(@RequestParam(required = false, defaultValue = "Hola Mundo") String informacion){
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(informacion);
        return parametro1;
    }
    

}
