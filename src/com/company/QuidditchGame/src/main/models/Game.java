package com.company.QuidditchGame.src.main.models;

import java.util.HashMap;

public class Game {
    private HashMap<Team,Integer> scoreBoard;
    private static int gameCount;

    public Game(Team home, Team away){
        this.scoreBoard = new HashMap<Team, Integer>();
        /*
        if you go with creating a copy of each team in constructor you should*
         override equals method and hashcode method in object class.
         */
        scoreBoard.put(new Team(home),0);
        scoreBoard.put(new Team(away),0);
        gameCount++;
        /*
        if you go with reference to the teams created you do not need to
        override equals method and hashcode method in the object class.
         */
//        scoreBoard.put(home,0);
//        scoreBoard.put(away,0);
    }

    public int getScore(Team team){
        return scoreBoard.get(team);
    }

    public void setScore(Team team, Integer score){
        scoreBoard.put(team, score);
    }

    public Team getTeam(String name){
        return scoreBoard.keySet().stream().filter((key)-> key.getHouse().equals(name))
                .findFirst()
                .orElse(null);
    }
}
