package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void shouldReturnWorldPopulation() {
        //Given
        Country country1 = new Country("Polska", new BigDecimal("40000000"));
        Country country2 = new Country("Włochy", new BigDecimal("60500000"));
        Country country3 = new Country("Japonia", new BigDecimal("126478000"));
        Country country4 = new Country("Chiny", new BigDecimal("1390080000"));
        Country country5 = new Country("USA", new BigDecimal("326079000"));
        Continent continent1 = new Continent("Europa");
        Continent continent2 = new Continent("Azja");
        Continent continent3 = new Continent("Ameryka Północna");
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent2.addCountry(country3);
        continent2.addCountry(country4);
        continent3.addCountry(country5);
        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        //When
        BigDecimal population = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("1943137000"), population);
    }
}
