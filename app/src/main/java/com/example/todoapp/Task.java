package com.example.todoapp;

import android.widget.CheckBox;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;
    private Category category;
    private CheckBox checkBox;


    public Task(){
        id = UUID.randomUUID();
        date = new Date();
    }

    public void setName(String n) {
        this.name = n;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean d) {
        this.done = d;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public CheckBox getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(CheckBox checkBox) {
        this.checkBox = checkBox;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
