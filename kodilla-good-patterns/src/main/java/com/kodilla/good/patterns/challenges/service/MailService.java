package com.kodilla.good.patterns.challenges.service;

public class MailService implements InformationService {
    @Override
    public void sendMessage(Customer customer) {
        System.out.println("Send message to: " + customer.getEmail());
    }
}
