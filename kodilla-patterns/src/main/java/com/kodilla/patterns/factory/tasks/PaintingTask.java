package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    boolean isExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    @Override
    public void  executeTask() {
        System.out.println("Painting " + whatToPaint + " with " + color + " colour.");
        isExecuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        if(isExecuted) {
            System.out.println("Good job! " + taskName + " completed.");
        } else {
            System.out.println(getTaskName() + " still not done.");
        }
        return isExecuted;
    }
}