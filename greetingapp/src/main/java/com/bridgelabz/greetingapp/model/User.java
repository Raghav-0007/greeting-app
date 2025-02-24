package com.bridgelabz.greetingapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")  // Optional, to specify table name
public class User {
    private String firstName;
    private String lastName;
    private String message;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generated ID
    private Long id;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
