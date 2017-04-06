package com.sdajava.optional;

import com.sdajava.optional.repository.TaskRepository;

public class Main {

    public static void main(String[] args) {


        TaskRepository taks = new TaskRepository();
        taks.loadData();
        System.out.println(taks.taskAssignedTo("213"));


    }
}
