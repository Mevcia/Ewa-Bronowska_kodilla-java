package com.kodilla.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {
    @Test
    public void testToString() {
//        Given
//        creating the TasksList for todos
        TasksList listToDo = new TasksList("Tasks to do");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTaskList().add(new Task("To Do Task number " + n)));

//        creating the TasksList for in progress
        TasksList listInProgress = new TasksList("Tasks in progress");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTaskList().add(new Task("In progress Task number " + n)));

//        creating the TasksList for done
        TasksList listDone = new TasksList("Tasks done");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getTaskList().add(new Task("Done Task number " + n)));

//        creating the board and assigning the lists
        Board board = new Board("Project 1");
        board.getListSet().add(listToDo);
        board.getListSet().add(listInProgress);
        board.getListSet().add(listDone);
        System.out.println(board);

//        When
//        Then
        Assert.assertEquals(3, board.getListSet().size());
    }
}
