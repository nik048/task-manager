package com.practice.tasksmanager.tasks;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;

@DataJpaTest
public class TaskServiceTests {
    @Autowired
            private TasksRepository tasksRepository;

    @Test
    public void testCreateTask(){
        TasksService tasksService = new TasksService(tasksRepository);
        TaskEntity task = tasksService.createTask(
                "Tesking",
                "Test case to check create func",
                new Date()
        );
        System.out.println("task = " + task);
    }
}
