package com.example.tanush.maindemo2.Classes;

public class Event {

    private String title;
    private String desc;
    private String image;
    private String url;

    public Event(String title, String image) {
        this.title = title;
        this.image = image;
    }

    public Event(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
