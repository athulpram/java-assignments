package com.step.assignments.javagenerics.league;

import java.util.ArrayList;
import java.util.Iterator;

public class League <T extends Team> {
    private String name;
    private ArrayList<T> teams= new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public void add(T team){
        teams.add(team);
    }

    public void showLeaderBoard(){
        Iterator iterator = this.teams.iterator();
        while(iterator.hasNext()){
        }
    }
}
