package com.kodilla.spring.portfolio;

import java.util.List;

public final class TaskList {
    private List<String> tasks;

    public TaskList(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void addTask(String newTask) {
        tasks.add(newTask);
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                '}';
    }
}
