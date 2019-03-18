package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String listName = "New topics to learn";
    private  static final String description = "List of topics to learn this month";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(listName, description);

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        List<TaskList> readTaskList = taskListDao.findByListName(listName);
        Assert.assertEquals(1, readTaskList.size());

        //CleanUp
        taskListDao.deleteById(id);
    }
}
