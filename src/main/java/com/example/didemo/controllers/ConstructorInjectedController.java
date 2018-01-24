package com.example.didemo.controllers;

import com.example.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//Inyeccion de derpendencias por medio del constructor

@Controller
public class ConstructorInjectedController {

    //Hago uso de la interfaz no de la propia clase
    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
