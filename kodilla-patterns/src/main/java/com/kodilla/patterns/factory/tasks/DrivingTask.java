package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    String taskStatus;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        taskStatus = "To drive";
    }

    @Override
    public String executeTask() {
        System.out.println("Driving " + where + " by " + using);
        return taskStatus = "Done";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean taskExecuted = false;
        if (taskStatus == "Done") {
            taskExecuted = true;
        }
        System.out.println(taskName + ": is executed: " + taskExecuted);
        return taskExecuted;
    }
}