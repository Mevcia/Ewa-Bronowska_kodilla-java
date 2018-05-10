package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private final Set<Continent> continents = new HashSet<>();

    public World() {
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal worldPopulation = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPopulation)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        return worldPopulation;
    }

    public Set<Continent> getContinents() {
        return continents;
    }
}
