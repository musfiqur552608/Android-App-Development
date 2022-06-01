package com.example.projectdemo;

public class ModelClass {
    private int image;
    private String name, time, message;

    public ModelClass(int image, String name, String time, String message) {
        this.image = image;
        this.name = name;
        this.time = time;
        this.message = message;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
