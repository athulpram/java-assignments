package com.step.assignments.javagenerics.league;

import java.util.ArrayList;

public abstract class Team {
    private String name;
    private int playersCount;
    private int played;
    private int gamesWon;
    private int gamesLost;
    private int gamesTied;

    private ArrayList<String> players = new ArrayList<String>();

    protected Team(String name, int playersCount, int played, int gamesWon, int gamesLost, int gamesTied) {
        this.name = name;
        this.playersCount = playersCount;
        this.played = played;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
        this.gamesTied = gamesTied;
    }


    public void addPlayer(String player){
        players.add(player);
    }

    public String getName() {
        return name;
    }

    public int compareTo(Team otherTeam ) {
        int teamPoint = this.calculatePoints();
        int otherTeamPoint = otherTeam.calculatePoints();
        if(otherTeamPoint > teamPoint){
            return -1;
        }
        if(otherTeamPoint < teamPoint){
            return 1;
        }
        return 0;
    }

    public abstract int calculatePoints();

    public int getPlayed() {
        return played;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public int getGamesTied() {
        return gamesTied;
    }
}
