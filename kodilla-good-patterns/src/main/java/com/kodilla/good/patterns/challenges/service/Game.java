package com.kodilla.good.patterns.challenges.service;

public class Game extends Product {

    private String version;

    public Game(String name, double price, boolean available, String version) {
        super(name, price, available);
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}
