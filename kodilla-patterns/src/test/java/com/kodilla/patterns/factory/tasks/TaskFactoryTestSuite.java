package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Food to buy", shoppingTask.getTaskName());
        Assert.assertEquals(false, shoppingTask.isTaskExecuted());
        Assert.assertEquals("Bought", shoppingTask.executeTask());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask1 = factory.makeTask(TaskFactory.PAINTINGTASK);
        String executeTask = paintingTask1.executeTask();
        Task paintingTask2 = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Painting the fence", paintingTask1.getTaskName());
        Assert.assertEquals("Painted", executeTask);
        Assert.assertEquals(true, paintingTask1.isTaskExecuted());
        Assert.assertEquals(false, paintingTask2.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Go to the university", drivingTask.getTaskName());
        Assert.assertEquals(false, drivingTask.isTaskExecuted());
        Assert.assertEquals("Done", drivingTask.executeTask());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }
}
