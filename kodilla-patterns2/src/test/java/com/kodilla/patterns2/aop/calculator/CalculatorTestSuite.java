package com.kodilla.patterns2.aop.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


@SpringBootTest
@RunWith(SpringRunner.class)
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorTestSuite.class);

    @Test
    public void shouldAdd() {
        double sum = calculator.add(10, 5);
        LOGGER.info("Testing add method");
        assertEquals(15, sum, 0.01);
    }
    @Test
    public void shouldSubtract() {
        double sub = calculator.sub(10, 5);
        LOGGER.info("Testing sub method");
        assertEquals(5, sub, 0.01);
    }
    @Test
    public void shouldMultiply() {
        double mul = calculator.mul(10, 5);
        LOGGER.info("Testing mul method");
        assertEquals(50, mul, 0.01);
    }
    @Test
    public void shouldDivide() {
        double div = calculator.div(10, 5);
        LOGGER.info("Testing div method");
        assertEquals(2, div, 0.01);
    }

    @Test
    public void shouldReturnFactorial() {
        BigDecimal result = calculator.factorial(new BigDecimal(1000));
        LOGGER.info("Testing factorial method");
        System.out.println(result);
        assertTrue(BigDecimal.ONE.compareTo(result) < 0);
    }
}
