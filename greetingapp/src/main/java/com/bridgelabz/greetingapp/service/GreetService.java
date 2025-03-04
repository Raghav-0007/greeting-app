package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.model.User;
import com.bridgelabz.greetingapp.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;

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

    public List<String> getList(){
        return repo.findAllUserMessages();
    }

    public void updateMessage(String id){
        User user=repo.findByUserId(id);
        String message=user.getMessage()+" from BridgeLabze";
        user.setMessage(message);
        repo.flush();
    }

    public void deleteMessage(String id){
        User user=repo.findByUserId(id);
        user.setMessage("");
        repo.flush();
    }
}
