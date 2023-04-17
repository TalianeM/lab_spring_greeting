package com.example.lab_spring_greeting.controllers;

import com.example.lab_spring_greeting.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// localhost:8080
@RestController
public class GreetingController {
    @GetMapping("/greeting")//localhost:8080/greeting
    public Greeting greeting(){
        return new Greeting("Name1","Good Afternoon");
    }

    // Create object name, timeofDay
}
