package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private final BunType bunType;
    private final int burgers;
    private final SauceType sauceType;
    private final List<Ingredient> ingredients;

    private BigMac(BunType bunType, int burgers, SauceType sauceType, List<Ingredient> ingredients) {
        this.bunType = bunType;
        this.burgers = burgers;
        this.sauceType = sauceType;
        this.ingredients = ingredients;
    }

    public BunType getBunType() {
        return bunType;
    }

    public int getBurgers() {
        return burgers;
    }

    public SauceType getSauceType() {
        return sauceType;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public static class Builder {
        private BunType bunType;
        private int burgers;
        private SauceType sauceType;
        private List<Ingredient > ingredients = new ArrayList<>();

        public Builder bunType(BunType bunType) {
            this.bunType = bunType;
            return this;
        }

        public Builder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public Builder sauce(SauceType sauceType) {
            this.sauceType = sauceType;
            return this;
        }

        public Builder ingredient(Ingredient ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(bunType, burgers, sauceType, ingredients);
        }
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bunType=" + bunType +
                ", burgers=" + burgers +
                ", sauceType=" + sauceType +
                ", ingredients=" + ingredients +
                '}';
    }
}
