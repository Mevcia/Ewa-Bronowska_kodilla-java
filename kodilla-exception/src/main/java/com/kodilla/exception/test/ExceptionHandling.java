package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 2;
        double y = 2.5;

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(x, y));

        } catch (Exception e) {
            if ((x >= 2 || x < 1) && (y == 1.5)) {
                System.out.println("Forbidden values of X and Y. Choose other numbers.");
            } else {
                if (y == 1.5) {
                    System.out.println("Forbidden value of Y. Choose other number.");
                } else {
                    System.out.println("Forbidden value of X. Choose other number.");
                }
            }

        } finally {
            System.out.println("Try again or finish program");
        }
    }
}