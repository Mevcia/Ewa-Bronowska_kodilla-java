package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDate;

public class ProductOrderRegister {
    public boolean createOrder(final Customer customer, final Product product, final LocalDate orderDate) {
        System.out.println("Order " + "added to the register");
        return true;
    }
}
