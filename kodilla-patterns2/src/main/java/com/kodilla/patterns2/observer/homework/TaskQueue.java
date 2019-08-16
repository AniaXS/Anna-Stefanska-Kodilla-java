package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TaskQueue implements Observable {
    private final String student;
    private final String name;
    private final Queue<String> tasks;
    private final List<Observer> observers;

    public TaskQueue(String student, String name) {
        tasks = new ArrayDeque<>();
        observers = new ArrayList<>();
        this.student = student;
        this.name = name;
    }

    public void addTask(String task) {
        tasks.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getStudent() {
        return student;
    }

    public String getName() {
        return name;
    }

    public Queue<String> getTasks() {
        return tasks;
    }
}
