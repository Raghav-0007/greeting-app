package com.bridgelabz.greetingapp.repository;

import com.bridgelabz.greetingapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.rmi.server.ObjID;

@Repository
public interface GreetingRepo extends JpaRepository<User, Long> {
}
