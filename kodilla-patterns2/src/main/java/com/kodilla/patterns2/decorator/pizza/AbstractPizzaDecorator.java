package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaDecorator implements PizzaOrder {
    private PizzaOrder pizzaOrder;
    public AbstractPizzaDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal calculatePrice() {
        return pizzaOrder.calculatePrice();
    }

    @Override
    public String createPizzaDescription() {
        return pizzaOrder.createPizzaDescription();
    }
}
