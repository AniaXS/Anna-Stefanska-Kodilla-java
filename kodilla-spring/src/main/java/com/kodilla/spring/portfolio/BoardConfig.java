package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    @Bean
    public Board createBoard(@Qualifier("toDoList") TaskList toDoList, @Qualifier("inProgressList") TaskList inProgressList,
                             @Qualifier("doneList") TaskList doneList) {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDoList")
    public TaskList createToDoList() {
        List<String> tasks = new ArrayList<>();
        TaskList toDoList = new TaskList(tasks);
        tasks.add("To do 1");
        tasks.add("To do 2");
        return toDoList;
    }

    @Bean(name = "inProgressList")
    public TaskList createInProgressList() {
        List<String> tasks = new ArrayList<>();
        tasks.add("InProgress 1");
        tasks.add("InProgress 2");
        return new TaskList(tasks);
    }

    @Bean(name = "doneList")
    public TaskList createDoneList() {
        List<String> tasks = new ArrayList<>();
        tasks.add("Done 1");
        tasks.add("Done 2");
        return new TaskList(tasks);
    }
}