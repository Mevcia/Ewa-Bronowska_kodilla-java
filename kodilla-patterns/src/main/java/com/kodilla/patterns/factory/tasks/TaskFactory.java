package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskType) {
        switch (taskType) {
            case SHOPPING :
                return new ShoppingTask("Saturday shopping", "oranges" , 10.0);
            case PAINTING :
                return new PaintingTask("Summer renovation", "red", "living room");
            case DRIVING :
                return new DrivingTask("Visiting Mum", "Mum's home", "bike");
            default:
                return null;
        }
    }
}