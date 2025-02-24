package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.model.User;
import com.bridgelabz.greetingapp.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    // create post request to get user data
    @PostMapping("/user")
    public String sayHelloWithName(@RequestBody User user){
        String message= "Hello "+user.getFirstName()+" "+ user.getLastName();
        user.setMessage(message);
        greetService.saveUser(user);
        return user.getMessage();
    }

    @GetMapping("/get/{id}")
    public String getById(@PathVariable String id){
        return greetService.getMessage(id);
    }
}
