package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean(name = "toDoList")
    TaskList createToDoList(){
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    TaskList createInProgressList(){
        return new TaskList();
    }

    @Bean(name = "doneList")
    TaskList createDoneList(){
        return new TaskList();
    }

    @Bean
    Board createBoard(@Qualifier("toDoList") TaskList toDo, @Qualifier("inProgressList") TaskList inProgress, @Qualifier("doneList") TaskList done) {
        return new Board(toDo, inProgress, done);
    }
}
