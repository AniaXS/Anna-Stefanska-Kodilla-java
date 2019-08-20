package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testUpdateTaksQueue() {
        //Given
        Student eveAdams = new Student("Eve Adams");
        Student adamGreen = new Student("Adam Green");
        Student maryMoore = new Student("Mary Moore");
        Mentor tomNewman = new Mentor("Tom Newman");
        Mentor helenDravies = new Mentor("Helen Davies");
        eveAdams.registerObserver(helenDravies);
        adamGreen.registerObserver(tomNewman);
        maryMoore.registerObserver(helenDravies);
        maryMoore.registerObserver(tomNewman);
        maryMoore.removeObserver(tomNewman);
        //When
        eveAdams.addTask(new Task("Facade", "facade solution"));
        adamGreen.addTask(new Task("functions", "Find user by ID"));
        adamGreen.addTask(new Task(" Update tables", "Factory"));
        maryMoore.addTask(new Task("Builder", "Pizza builder"));
        eveAdams.addTask(new Task("Mockito", "Application tests"));
        maryMoore.addTask(new Task("Facade", "Library facade"));
        maryMoore.addTask(new Task("Classes", "Alarm clock"));
        adamGreen.addTask(new Task("Variables", "true or false?"));
        adamGreen.addTask(new Task("ManyToMany", "Library"));
        //Then
        assertEquals(4, tomNewman.getTasksCount());
        assertEquals(5, helenDravies.getTasksCount());
    }
}
