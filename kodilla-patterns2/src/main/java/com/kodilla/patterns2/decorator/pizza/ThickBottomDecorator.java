package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ThickBottomDecorator extends AbstractPizzaDecorator{
    public ThickBottomDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal calculatePrice() {
        return super.calculatePrice().add(new BigDecimal(5));
    }

    @Override
    public String createPizzaDescription() {
        return super.createPizzaDescription() + " on thick bottom";
    }
}
