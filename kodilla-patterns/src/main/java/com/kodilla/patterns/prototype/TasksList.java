package com.kodilla.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public final class TasksList {
    final private String name;
    final private List<Task> taskList = new ArrayList<>();

    public TasksList(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    @Override
    public String toString() {
        String s = "   List [" + name + "]";
        for(Task task : taskList) {
            s = s + "\n" + task.toString();
        }
        return s;
    }
}