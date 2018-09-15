package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderDecoratorTestSuite {
    @Test
    public void shouldReturnBasicPizzaOrder() {
        PizzaOrder pizza = new BasicPizza();

        BigDecimal price = pizza.calculatePrice();
        String description = pizza.createPizzaDescription();

        assertEquals(new BigDecimal(15), price);
        assertEquals("You have just ordered a pizza", description);
    }

    @Test
    public void shouldReturnAllOptionsOrder() {
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        pizzaOrder = new ThickBottomDecorator(pizzaOrder);
        pizzaOrder = new OwnPickUpOptionDecorator(pizzaOrder);

        BigDecimal thePrice = pizzaOrder.calculatePrice();
        String theOrder = pizzaOrder.createPizzaDescription();
        System.out.println(theOrder + " Calculated price is: " +thePrice + " zl");

        assertEquals(new BigDecimal(16), thePrice);
        assertEquals("You have just ordered a pizza with additional cheese on thick bottom, which you come to pick up yourself.", theOrder);
    }
}
