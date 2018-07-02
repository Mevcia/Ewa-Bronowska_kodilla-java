package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private final BunType bunType;
    private final int burgers;
    private final SauceType sauceType;
    private final List<String> ingredients;

    private BigMac(BunType bunType, int burgers, SauceType sauceType, List<String> ingredients) {
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

    public List<String> getIngredients() {
        return ingredients;
    }

    public static class BigMacBuilder {
        private BunType bunType;
        private int burgers;
        private SauceType sauceType;
        private List<String > ingredients = new ArrayList<>();

        public BigMacBuilder BunType(BunType bunType) {
            this.bunType = bunType;
            return this;
        }

        public BigMacBuilder Burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder Sauce(SauceType sauceType) {
            this.sauceType = sauceType;
            return this;
        }

        public BigMacBuilder Ingredient(Ingredient ingredient) {
            ingredients.add(String.valueOf(ingredient));
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
