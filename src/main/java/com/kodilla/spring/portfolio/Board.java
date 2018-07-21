package com.kodilla.spring.portfolio;

import java.util.List;

class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    Board(TaskList toDo, TaskList inProgress, TaskList done) {
        this.toDoList = new TaskList();
        this.inProgressList = new TaskList();
        this.doneList = new TaskList();
    }
    void addTaskToToDoList(String task){
        toDoList.getTasks().add(task);
    }
    List<String> getToDoList(){
        return toDoList.getTasks();
    }
    void addTaskToInProgressList(String task){
        inProgressList.getTasks().add(task);
    }
    List<String> getInProgressList(){
        return inProgressList.getTasks();
    }
    void addTaskToDoneList(String task){
        doneList.getTasks().add(task);
    }
    List<String> getDoneList(){
        return doneList.getTasks();
    }
}
