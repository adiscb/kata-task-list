package com.codurance.training.tasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class Task {
    private final long id;
    private final String description;
    private boolean done;
    private LocalDateTime deadline;


    public Task(long id, String description, boolean done) {
        this.id = id;
        this.description = description;
        this.done = done;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setDeadline(String deadline) {
        this.deadline = LocalDateTime.parse(deadline, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

    }
}
