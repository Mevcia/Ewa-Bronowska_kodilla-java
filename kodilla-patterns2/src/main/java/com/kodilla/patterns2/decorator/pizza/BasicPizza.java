package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements PizzaOrder {
    @Override
    public BigDecimal calculatePrice() {
        return new BigDecimal(15);
    }

    @Override
    public String createPizzaDescription() {
        return "You have just ordered a pizza";
    }
}
