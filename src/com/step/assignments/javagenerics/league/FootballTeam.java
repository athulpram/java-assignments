package com.step.assignments.javagenerics.league;

public class FootballTeam extends Team {


    protected FootballTeam(String name, int playersCount, int played, int gamesWon, int gamesLost, int gamesTied) {
        super(name, playersCount, played, gamesWon, gamesLost, gamesTied);
    }

    @Override
    public int calculatePoints() {
        return this.getGamesWon() * 1 + this.getGamesLost() * -2;
    }
}
