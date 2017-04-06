package com.sdajava.optional.model;

import java.util.Optional;

/**
 * Created by lukas on 05.04.2017.
 */
public class Task {

    private String title;
    private String id;
    private Optional<User> assignetTo;

    public Task(String title, String id) {
        this.title = title;
        this.id = id;
    }

    public Task(String title, String id, User assignetTo) {
        this.title = title;
        this.id = id;
        this.assignetTo = Optional.ofNullable(assignetTo);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Optional<User> getAssignetTo() {
        return assignetTo;
    }

    public void setAssignetTo(Optional<User> assignetTo) {
        this.assignetTo = assignetTo;
    }
}
