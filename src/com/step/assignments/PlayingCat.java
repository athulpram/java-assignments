package com.step.assignments;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false,25));
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        int upper_limit = 35;
        if(summer){
            upper_limit = 45;
        }
        return (temperature>=25 && temperature<=upper_limit);
    }
}