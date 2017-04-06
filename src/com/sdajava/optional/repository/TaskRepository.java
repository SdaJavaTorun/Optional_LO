package com.sdajava.optional.repository;

import com.sdajava.optional.model.Task;
import com.sdajava.optional.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by lukas on 05.04.2017.
 */
public class TaskRepository {

    private Map<String, Task> database = new HashMap<>();

    public void loadData(){

        User user1 = new User("Lukasz", "Adres");
        User user2 = new User("Janek", "Torun");

        database.put("1", new Task("Task 1", "1", user1));
        database.put("2", new Task("Task 1", "2", user1));
        database.put("3", new Task("Task 1", "3", user2));
        database.put("4", new Task("Task 1", "4", user1));

    }

    //dodac z wyrzuceniem prostego komunikatu
    // napisac dwa testy
    public Task find(String id){
        return Optional.ofNullable(database.get(id))
                       .orElseThrow(() -> new TaskNotFoundException(id));
    }

    public Optional<String> taskAssignedTo(String id){
        return Optional.ofNullable(find(id))
                       .flatMap(task -> task.getAssignedTo())
                       .map(user -> user.getUsername());
    }

}
