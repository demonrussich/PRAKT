package com.company.models;

public class Lesson {
    private Integer id;
    private String name;
    private String day;
    private String time;
    private  Integer own_cours;

    public Lesson(Integer id, String name, String day, String time, Integer own_cours) {
        this.id = id;
        this.name = name;
        this.day = day;
        this.time = time;
        this.own_cours = own_cours;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getOwn_cours() {
        return own_cours;
    }

    public void setOwn_cours(Integer own_cours) {
        this.own_cours = own_cours;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", day='" + day + '\'' +
                ", time='" + time + '\'' +
                ", own_cours=" + own_cours +
                '}';
    }
}
