package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @Autowired
    GreetService greetService;

    // simple get request to say hello
    @GetMapping("/hello")
    public String sayHello(){
        return greetService.sayHello();
    }
}
