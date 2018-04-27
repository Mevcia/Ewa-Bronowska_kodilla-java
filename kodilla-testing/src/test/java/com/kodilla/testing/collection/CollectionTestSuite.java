package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionTestSuite {
    private String[] listOfTestNames = new String[] {"for Empty List", "for Normal List"};
    private static int n = 0;

    @Before
    public void before() {
        System.out.println("Begin the Test Case " + listOfTestNames[n]);
        n++;
    }
    @After
    public void after() {
        System.out.println("End Test Case");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> evenNumbers = exterminator.exterminate(Collections.emptyList());
        System.out.println("List of even numbers: " + evenNumbers);
        //Then
        Assert.assertEquals(Collections.emptyList(), evenNumbers);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> evenNumbers = exterminator.exterminate(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        System.out.println("List of even numbers: " + evenNumbers);
        //Then
        Assert.assertEquals(Arrays.asList(2,4,6,8,0), evenNumbers);
    }
}
