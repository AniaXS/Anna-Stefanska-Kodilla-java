package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;
    String taskStatus;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        taskStatus = "To paint";
    }

    @Override
    public String executeTask() {
        System.out.println("Painting " + whatToPaint + " on " + color);
        return taskStatus = "Painted";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean taskExecuted = false;
        if (taskStatus == "Painted") {
            System.out.println("Task: " + taskName + " - is executed");
            taskExecuted = true;
        }
        return taskExecuted;
    }
}
