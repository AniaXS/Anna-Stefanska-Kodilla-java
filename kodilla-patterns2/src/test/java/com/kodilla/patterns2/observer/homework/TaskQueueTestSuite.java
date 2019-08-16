package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testUpdateTaksQueue() {
        //Given
        TaskQueue javaCourse1 = new TaskQueue("Eve Adams", "Java");
        TaskQueue sqlCourse1 = new TaskQueue("Adam Green", "SQL Course");
        TaskQueue javaCourse2 = new TaskQueue("Mary Moore", "Java");
        Mentor tomNewman = new Mentor("Tom Newman");
        Mentor helenDravies = new Mentor("Helen Davies");
        javaCourse1.registerObserver(helenDravies);
        sqlCourse1.registerObserver(helenDravies);
        sqlCourse1.registerObserver(tomNewman);
        javaCourse2.registerObserver(helenDravies);
        sqlCourse1.removeObserver(helenDravies);
        //When
        javaCourse1.addTask("Shop");
        javaCourse2.addTask("Letters");
        sqlCourse1.addTask("Create database");
        javaCourse2.addTask("School");
        sqlCourse1.addTask("Invoices");
        sqlCourse1.addTask("Library");
        javaCourse2.addTask("Factory");
        javaCourse1.addTask("Letters");
        //Then
        assertEquals(3, tomNewman.getTasksCount());
        assertEquals(5, helenDravies.getTasksCount());
    }
}
