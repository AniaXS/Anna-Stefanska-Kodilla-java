package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String userame;
    private int tasksCount;

    public Mentor(String userame) {
        this.userame = userame;
    }

    @Override
    public void update(Student student) {
        System.out.println(userame + ": " + student.getUserame() + " added new task to queue." +
                "\n(total: " + student.getTasks().size() + " tasks)");
        tasksCount++;
    }

    public String getUserame() {
        return userame;
    }

    public int getTasksCount() {
        return tasksCount;
    }
}
