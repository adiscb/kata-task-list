package com.codurance.training.tasks;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Backlog {

    private Map<String, Project> map;

    public Backlog() {
        this.map = new LinkedHashMap<>();
    }

    public Collection<Project> getProjects() {
        return map.values();
    }

    public void add(Project project){
        map.put(project.getName(), project);
    }

    public void addTaskTo(Project project, Task task){
        map.get(project.getName()).getTasks().add(task);
    }

    public Project get(String name){
        return map.get(name);
    }


}
