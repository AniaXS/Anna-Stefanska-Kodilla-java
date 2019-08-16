package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String userame;
    private int tasksCount;

    public Mentor(String userame) {
        this.userame = userame;
    }

    @Override
    public void update(TaskQueue tasks) {
        int total = tasks.getTasks().size();
        System.out.println(userame + ": " + tasks.getStudent() + " added new task to queue " + tasks.getName() +
                "\n (total: " + total + " tasks)");
        tasksCount++;
    }

    public String getUserame() {
        return userame;
    }

    public int getTasksCount() {
        return tasksCount;
    }
}
