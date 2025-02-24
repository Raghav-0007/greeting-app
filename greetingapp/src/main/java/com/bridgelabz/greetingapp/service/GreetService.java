package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.User;
import com.bridgelabz.greetingapp.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class GreetService {

    @Autowired
    GreetingRepo repo;

    public String sayHello(){
        return "Hello from BridgeLabz";
    }

    public void saveUser(User user){
        repo.save(user);
    }


    public String  getMessage(String id){
        return repo.findByUserId(id).getMessage();
    }
}
