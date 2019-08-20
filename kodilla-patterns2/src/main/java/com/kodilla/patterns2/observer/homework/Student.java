package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Student implements Observable {
    private final String userame;
    private final Queue<Task> tasks;
    private final List<Observer> observers;

    public Student(String userame) {
        tasks = new ArrayDeque<>();
        observers = new ArrayList<>();
        this.userame = userame;
    }

    public void addTask(Task task) {
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

    public String getUserame() {
        return userame;
    }

    public Queue<Task> getTasks() {
        return tasks;
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
