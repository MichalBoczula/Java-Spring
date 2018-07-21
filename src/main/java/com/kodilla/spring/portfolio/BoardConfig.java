package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard(@Qualifier("toDo") TaskList toDo,
                          @Qualifier("inProgress") TaskList inProgress,
                          @Qualifier("done") TaskList done) {
        return new Board(toDo, inProgress, done);
    }

    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgress")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "done")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }
}
