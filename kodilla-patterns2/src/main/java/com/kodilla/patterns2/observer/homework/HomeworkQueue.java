package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class HomeworkQueue implements Observable{
    private List<Observer> observers;
    private Queue<Exercise> tasksToCheck;
    private String courseName;

    public HomeworkQueue(String mentorName) {
        observers = new ArrayList<>();
        tasksToCheck = new ArrayDeque<>();
        this.courseName = mentorName;
    }

    public void buildTheQueue(Exercise exercise) {
        tasksToCheck.add(exercise);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Queue<Exercise> getTasksToCheck() {
        return tasksToCheck;
    }

    public String getMentorName() {
        return courseName;
    }
}
