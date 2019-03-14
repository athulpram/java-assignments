package com.step.assignments.playlist;

public class Song {
    private String title;
    private double duration;


    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public void play(){
        System.out.println("Playing song "+this.title);
        System.out.println("Duration : "+ this.duration);
    }
}
