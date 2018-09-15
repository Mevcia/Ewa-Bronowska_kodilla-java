package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class OwnPickUpOptionDecorator extends AbstractPizzaDecorator {
    public OwnPickUpOptionDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal calculatePrice() {
        return super.calculatePrice().subtract(new BigDecimal(7));
    }

    @Override
    public String createPizzaDescription() {
        return super.createPizzaDescription() + ", which you come to pick up yourself.";
    }
}
