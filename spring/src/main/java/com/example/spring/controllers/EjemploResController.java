package com.example.spring.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.spring.models.dto.ClaseDTO;







@RestController
@RequestMapping("/api")
public class EjemploResController {

    // http://localhost:8080/api/detalles_info2
    @GetMapping(path = "/detalles_info2")
    
    // metodo Handler Rest
    public ClaseDTO detalles_info2(){
        // Empleado empleado1 = new Empleado("Onega", "Chavarria", "av Temuco 1071", "Developer", 28, 940673637, 01);
        // Map<String, Object> respuesta = new HashMap<>();
        // respuesta.put("Empleado", "Datos Empleado");
        // respuesta.put("Informacion", empleado1);

        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Developer");

        return usuario1;
    }

}
