package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDate;

public class ProductOrderService {
    public boolean order (final Customer customer, final Product product, final LocalDate orderDate){
        System.out.println("Order registered: "
                + customer.getFirstName() + " " + customer.getLastName()
                + ", " + product.getName() + ", " + product.getPrice()
                + ", order date " + orderDate.toString());
        return true;
    }
}
