package com.kodilla.patterns.prototype;

import java.util.HashSet;
import java.util.Set;

public final class Board extends Prototype {
    private String name;
    private Set<TasksList> listsSet = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TasksList> getListsSet() {
        return listsSet;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]";
        for (TasksList list : listsSet) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

    public Board shallowCopy() throws CloneNotSupportedException {
        return (Board)super.clone();
    }

    public Board deepCopy() throws CloneNotSupportedException {
        Board clonedBord = (Board)super.clone();
        clonedBord.listsSet = new HashSet<>();
        for (TasksList theList : listsSet) {
            TasksList clonedTaskList = new TasksList(theList.getName());
            for (Task theTask : theList.getTaskList()) {
                clonedTaskList.getTaskList().add(theTask);
            }
            clonedBord.getListsSet().add(clonedTaskList);
        }
        return clonedBord;
    }
}