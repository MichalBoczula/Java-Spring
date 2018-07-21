package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class BoardConfigTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        final ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        final Board board =context.getBean(Board.class);
        board.addTaskToToDoList("First task to do");
        board.addTaskToInProgressList("First task in progress");
        board.addTaskToDoneList("First task done");
        //When & Then
        assertEquals(1, board.getToDoList().size());
        assertEquals("First task to do", board.getToDoList().get(0));
        assertEquals(1, board.getInProgressList().size());
        assertEquals("First task in progress", board.getInProgressList().get(0));
        assertEquals(1, board.getDoneList().size());
        assertEquals("First task done", board.getDoneList().get(0));
    }

}