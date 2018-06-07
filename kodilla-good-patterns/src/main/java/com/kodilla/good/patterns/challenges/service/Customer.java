package com.kodilla.good.patterns.challenges.service;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;

    public Customer(final String firstName, final String lastName, final String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
