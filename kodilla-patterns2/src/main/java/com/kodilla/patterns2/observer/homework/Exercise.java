package com.kodilla.patterns2.observer.homework;

public class Exercise {
    private String courseEdition;
    private String exerciseNumber;
    private String studentName;

    public Exercise(String courseEdition, String exerciseNumber, String studentName) {
        this.courseEdition = courseEdition;
        this.exerciseNumber = exerciseNumber;
        this.studentName = studentName;
    }

    public String getCourseEdition() {
        return courseEdition;
    }

    public String getExerciseNumber() {
        return exerciseNumber;
    }

    public String getStudentName() {
        return studentName;
    }
}
