package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDate;

public class OrderRequest {
    private Customer customer;
    private Product product;
    private LocalDate orderDate;

    public OrderRequest(Customer customer, Product product, LocalDate orderDate) {
        this.customer = customer;
        this.product = product;
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
