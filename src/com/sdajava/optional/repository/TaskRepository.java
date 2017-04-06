package com.sdajava.optional.repository;

import com.sdajava.optional.model.Task;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by lukas on 05.04.2017.
 */
public class TaskRepository {

    private Map<String, Task> database = new HashMap<>();

    public void loadData(){

        database.put("1", new Task("Task 1", "1"));
        database.put("2", new Task("Task 1", "2"));
        database.put("3", new Task("Task 1", "3"));
        database.put("4", new Task("Task 1", "4"));

    }

    public Task find(String id){
        return Optional.ofNullable(database.get(id))
                       .orElseThrow(() -> new TaskNotFoudException(id));
    }





}
