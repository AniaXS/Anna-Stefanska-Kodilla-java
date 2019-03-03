package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Food to buy", "Eggs", 12.0);
            case PAINTINGTASK:
                return new PaintingTask("Painting the fence", "green", "Fence");
            case DRIVINGTASK:
                return new DrivingTask("Go to the university", "London", "own car");
            default:
                return null;
        }
    }
}
