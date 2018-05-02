package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AdvStatisticsTestSuite {
    private static int testCounter = 0;

    @Before
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Preparing test # " + testCounter);
    }
    @After
    public void afterEachTest() {
        System.out.println("Test finished");
    }

    @Test
    public void testUserNumberEmpty() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(userList);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int userNumberNow = statisticsCalculator.getNumberOfUsers();
        //Then
        Assert.assertEquals(0,userNumberNow);
    }
    @Test
    public void testUserNumber100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        for(int i = 0; i<100; i++) {
            userList.add("abc" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int userNumberNow = statisticsCalculator.getNumberOfUsers();
        //Then
        Assert.assertEquals(100, userNumberNow);
    }
    @Test
    public void testPostNumber0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postNumber = 0;
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int postNumberNow = statisticsCalculator.getNumberOfPosts();
        //Then
        Assert.assertEquals(0, postNumberNow);
    }

    @Test
    public void testPostNumber1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postNumber = 1000;
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int postNumberNow = statisticsCalculator.getNumberOfPosts();
        //Then
        Assert.assertEquals(1000, postNumberNow);
    }
    @Test
    public void testCommentNumber0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentNumber = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int commentNumberNow = statisticsCalculator.getNumberOfComments();
        //Then
        Assert.assertEquals(0, commentNumberNow);
    }
    @Test
    public void testCommentsBiggerPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postNumber = 5;
        int commentNumber = 100;
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double avCommentPerPostNow = statisticsCalculator.getAverageCommentsPerPost();
        //Then
        Assert.assertEquals(0.05, avCommentPerPostNow);
    }
    @Test
    public void testPostsBiggerComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postNumber = 100;
        int commentNumber = 5;
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double avCommentPerPost = statisticsCalculator.getAverageCommentsPerPost();
        //Then
        Assert.assertEquals(20, avCommentPerPost);
    }
}
