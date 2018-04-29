package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double baseLenght;
    private double height;

    Triangle(double baseLenght, double height) {
        this.baseLenght = baseLenght;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        return (baseLenght * height) * 0.5;
    }
}
