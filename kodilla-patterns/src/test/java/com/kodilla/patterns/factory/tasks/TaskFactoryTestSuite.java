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
        System.out.println(shopping.executeTask());
        boolean taskCompleted = shopping.isTaskExecuted();

//        Then
        Assert.assertEquals("Going for shopping to buy 10.0 pcs of oranges", shopping.executeTask());
        Assert.assertTrue(taskCompleted);
    }

    @Test
    public void shouldCreatePaintingTask() {
//        Given
        TaskFactory factory = new TaskFactory();
//        When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        String result = painting.executeTask();
        boolean taskCompleted = painting.isTaskExecuted();
//        Then
        Assert.assertEquals("Painting living room with red colour.", result);
        Assert.assertTrue(taskCompleted);
    }
    @Test
    public void shouldCreateDrivingTask() {
//        Given
        TaskFactory factory = new TaskFactory();
//        When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        System.out.println(driving.executeTask());
        String result = driving.getTaskName();
//        Why my getters do not work? (only methods override from interface work)
//        String destination = driving.getWhere();
//        Then
        Assert.assertEquals("Visiting Mum", result);
    }
}
