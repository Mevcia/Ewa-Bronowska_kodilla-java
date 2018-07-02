package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void shouldBuildBigMac() {
//        Given
        BigMac bigMac = new BigMac.Builder()
                .ingredient(Ingredient.LETTUCE)
                .bunType(BunType.WITH_SESAME)
                .burgers(3)
                .sauce(SauceType.BARBECUE)
                .ingredient(Ingredient.BACON)
                .ingredient(Ingredient.CHILI_PEPPERS)
                .ingredient(Ingredient.MUSHROOMS)
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
