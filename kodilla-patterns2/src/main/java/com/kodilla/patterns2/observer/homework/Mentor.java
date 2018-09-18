package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private String name;
    private int count;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println(name + " - "
                + "kursant " + homeworkQueue.getTasksToCheck().peek().getStudentName()
                + " z kursu " + homeworkQueue.getTasksToCheck().peek().getCourseEdition()
                + " wyslal Ci nowe zadanie do sprawdzenia, modul " + homeworkQueue.getTasksToCheck().peek().getExerciseNumber());
        count++;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
