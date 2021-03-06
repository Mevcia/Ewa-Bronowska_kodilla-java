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
        board.getListsSet().add(listToDo);
        board.getListsSet().add(listInProgress);
        board.getListsSet().add(listDone);

//        making a shallow clone of object board
        Board clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

//        making a deep clone of object board
        Board deepClonedBoard = null;
        try {
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

//        When
        board.getListsSet().remove(listToDo);

//        Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);
        Assert.assertEquals(2, board.getListsSet().size());
        Assert.assertEquals(2, clonedBoard.getListsSet().size());
        Assert.assertEquals(3, deepClonedBoard.getListsSet().size());
        Assert.assertEquals(clonedBoard.getListsSet(), board.getListsSet());
        Assert.assertNotEquals(deepClonedBoard.getListsSet(), board.getListsSet());
    }
}