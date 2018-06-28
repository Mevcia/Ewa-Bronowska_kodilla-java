package com.kodilla.patterns.prototype;

import java.util.HashSet;
import java.util.Set;

public final class Board {
    final private String name;
    final private Set<TasksList> listSet = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TasksList> getListSet() {
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
}