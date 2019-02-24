package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    List<String > tasks;

    public TaskList(List<String> tasks) {
        tasks = tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public TaskList addTask(String newTask) {
        tasks.add(newTask);
        return new TaskList(tasks);
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                '}';
    }
}
