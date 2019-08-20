package com.kodilla.patterns2.observer.homework;

public class Task {
    private final String name;
    private final String solution;

    public Task(String name, String solution) {
        this.name = name;
        this.solution = solution;
    }

    public String getName() {
        return name;
    }

    public String getSolution() {
        return solution;
    }
}
