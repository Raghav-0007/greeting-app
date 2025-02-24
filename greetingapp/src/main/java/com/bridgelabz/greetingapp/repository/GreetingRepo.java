package com.bridgelabz.greetingapp.repository;

import com.bridgelabz.greetingapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.rmi.server.ObjID;
import java.util.List;

@Repository
public interface GreetingRepo extends JpaRepository<User, Long> {
    User findByUserId(String name);

    // Fetch only usernames using JPQL
    @Query("SELECT u.message FROM User u")
    List<String> findAllUserMessages();
}
