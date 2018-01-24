package com.example.didemo.controllers;

import com.example.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//Inyeccion de derpendencias por medio de atributo

@Controller
public class PropertyInjectedController {

    //Hago uso de la interfaz no de la propia clase
    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}
