package com.kodilla.patterns.prototype;

import java.util.HashSet;
import java.util.Set;

public final class Board extends Prototype {
    private String name;
    private final Set<TasksList> listSet = new HashSet<>();

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
        return listSet;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]";
        for (TasksList list : listSet) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

    public Board shallowCopy() throws CloneNotSupportedException {
        return (Board)super.clone();
    }
}