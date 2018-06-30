package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void shouldCreateShoppingTask() {
//        Given
        TaskFactory factory = new TaskFactory();
//        When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
//        Then
        Assert.assertEquals("Saturday shopping", shopping.getTaskName());
        Assert.assertFalse(shopping.isTaskExecuted());
    }

    @Test
    public void shouldCreatePaintingTask() {
//        Given
        TaskFactory factory = new TaskFactory();
//        When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
//        Then
        Assert.assertEquals("Summer renovation", painting.getTaskName());
        Assert.assertTrue(painting.isTaskExecuted());
    }
    @Test
    public void shouldCreateDrivingTask() {
//        Given
        TaskFactory factory = new TaskFactory();
//        When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.isTaskExecuted();
        driving.executeTask();
        driving.isTaskExecuted();
//        Then
        Assert.assertEquals("Visiting Mum", driving.getTaskName());
    }
}
