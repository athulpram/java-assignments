package com.step.assignments.javagenerics.league;

public class CricketTeam extends Team {
    protected CricketTeam(String name, int playersCount, int played, int gamesWon, int gamesLost, int gamesTied) {
        super(name, playersCount, played, gamesWon, gamesLost, gamesTied);
    }

    @Override
    public int calculatePoints() {
        return this.getGamesWon()*2 + this.getGamesTied();
    }
}
