package com.sdajava.optional.repository;

/**
 * Created by lukas on 05.04.2017.
 */
public class TaskNotFoundException extends RuntimeException{

    public TaskNotFoundException(String id){
        super("Nie ma tasku o id: " + id);
    }

}
