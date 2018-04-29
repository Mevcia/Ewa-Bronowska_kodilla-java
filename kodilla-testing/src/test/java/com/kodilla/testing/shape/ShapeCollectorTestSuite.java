package com.kodilla.testing.shape;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    static int testCounter = 0;

    @Before
    public void beforeEachTest() {
        testCounter ++;
        System.out.println("Preparing test # " + testCounter);
    }
    @After
    public void afterEachTest() {
        System.out.println("Test finished");
    }
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square theSquare = new Square( 5.5);
        //When
        shapeCollector.addFigure(theSquare);
        //Then
        Assert.assertEquals(1, shapeCollector.getShapeCount());
    }
    @Test
    public void testRemoveFigure () {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle theTriangle = new Triangle(6.5, 8.7);
        shapeCollector.addFigure(theTriangle);
        //When
        boolean result = shapeCollector.removeFigure(theTriangle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapeCount());
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle theCircle = new Circle(4.2);
        shapeCollector.addFigure(theCircle);
        //When
        Shape ourFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(theCircle, ourFigure);
    }
}
