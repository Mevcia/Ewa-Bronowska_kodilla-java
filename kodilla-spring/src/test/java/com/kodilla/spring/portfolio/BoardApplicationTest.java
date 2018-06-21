package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardApplicationTest {
    @Test
    public void Board() {
//        Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
//        When
        board.getDoneList().addTask("Wysłać zadanie");

//        Then
        TaskList result = context.getBean("doneList", TaskList.class);
        Assert.assertEquals("Wysłać zadanie", result.getTasks().get(0));
    }
}
