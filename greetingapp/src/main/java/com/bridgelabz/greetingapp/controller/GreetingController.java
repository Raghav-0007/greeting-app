package com.bridgelabz.greetingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    // simple get request to say hello
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }
}
