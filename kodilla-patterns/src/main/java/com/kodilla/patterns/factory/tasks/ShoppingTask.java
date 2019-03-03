package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    String taskStatus;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        taskStatus = "To buy";
    }

    @Override
    public String executeTask() {
        System.out.println("Buying " + quantity + " " + whatToBuy);
        return taskStatus = "Bought";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean taskExecuted = false;
        if (taskStatus == "Bought") {
            System.out.println(whatToBuy + " is bought");
            taskExecuted = true;
        }
        return taskExecuted;
    }
}
