package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalCheeseDecorator extends AbstractPizzaDecorator {
    public AdditionalCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal calculatePrice() {
        return super.calculatePrice().add(new BigDecimal(3));
    }

    @Override
    public String createPizzaDescription() {
        return super.createPizzaDescription() + " with additional cheese";
    }
}
