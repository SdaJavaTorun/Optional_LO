package com.sdajava.optional.repository;

/**
 * Created by lukas on 05.04.2017.
 */
public class TaskNotFoudException extends RuntimeException{

    public TaskNotFoudException(String id){
        super("Nie ma tasku o id: " + id);
    }

}
