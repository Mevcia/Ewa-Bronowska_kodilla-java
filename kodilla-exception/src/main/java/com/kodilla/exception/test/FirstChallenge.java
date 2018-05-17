package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double a = 3;
        double b = 0;

        try {

            System.out.println(firstChallenge.divide(a, b));

        } catch (ArithmeticException aex) {

            System.out.println("You can't divide by 0!");

        } finally {

            System.out.println("Want to try again?");
        }
    }
}