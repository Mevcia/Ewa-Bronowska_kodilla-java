package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDate;

public class OrderRequestCollector {
    public OrderRequest collect() {
        Customer customer = new Customer("Jan", "Kowalski" , "Jan123@mail.com");
        Game game = new Game (" Nowa gra", 35.55, true, "2.0");
        LocalDate orderDate = LocalDate.of(2018, 6, 7);

        return new OrderRequest(customer, game, orderDate);
    }
}
