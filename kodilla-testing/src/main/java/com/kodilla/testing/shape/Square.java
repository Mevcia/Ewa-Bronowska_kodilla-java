package com.kodilla.testing.shape;

public class Square implements Shape {
    private double sideLength;

    Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return Math.sqrt(sideLength);
    }
}
