package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void shouldBuildBigMac() {
//        Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .Ingredient(Ingredient.LETTUCE)
                .BunType(BunType.WITH_SESAME)
                .Burgers(3)
                .Sauce(SauceType.BARBECUE)
                .Ingredient(Ingredient.BACON)
                .Ingredient(Ingredient.CHILI_PEPPERS)
                .Ingredient(Ingredient.MUSHROOMS)
                .build();
        System.out.println(bigMac);

//        When
        int numberOfIngredients = bigMac.getIngredients().size();

//        Then
        Assert.assertEquals(4, numberOfIngredients);
        Assert.assertEquals(3, bigMac.getBurgers());
        Assert.assertEquals(SauceType.BARBECUE, bigMac.getSauceType());
    }
}
