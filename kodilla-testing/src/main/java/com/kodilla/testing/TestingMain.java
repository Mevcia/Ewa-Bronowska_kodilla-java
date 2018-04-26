package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("Test Ok");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int addResult = calculator.add(21,7);

        if (addResult == 21 + 7) {
            System.out.println("Test Ok");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator1 = new Calculator();

        int substractResult = calculator1.substract(21,7);

        if (substractResult == 21 - 7) {
            System.out.println("Test Ok");
        } else {
            System.out.println("Error!");
        }
    }
}