package com.company.models;

import java.util.List;

public class Cours {
    private Integer id;
    private String name;
    private String date_start;
    private String date_end;

    private List<Lesson> lessons;
    public Cours(Integer id, String name, String date_start, String date_end) {
        this.id = id;
        this.name = name;
        this.date_start = date_start;
        this.date_end = date_end;
    }

    public Cours(String name, String date_start, String date_end) {
        this.name = name;
        this.date_start = date_start;
        this.date_end = date_end;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public String getDate_end() {
        return date_end;
    }

    public void setDate_end(String date_end) {
        this.date_end = date_end;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date_start='" + date_start + '\'' +
                ", date_end='" + date_end + '\'' +
                ", lessons=" + lessons +
                '}';
    }
}

