package com.example.user.topfootballers;

/**
 * Created by user on 20/09/2017.
 */

public class Footballer {

    private int ranking;
    private String name;
    private String club;

    public Footballer(int ranking, String name, String club){
        this.ranking = ranking;
        this.name = name;
        this.club = club;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

    public String getClub() {
        return club;
    }

}
