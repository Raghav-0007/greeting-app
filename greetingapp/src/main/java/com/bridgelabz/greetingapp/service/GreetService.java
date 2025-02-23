package com.bridgelabz.greetingapp.service;

import org.springframework.stereotype.Component;

@Component
public class GreetService {

    public String sayHello(){
        return "Hello from BridgeLabz";
    }
}
