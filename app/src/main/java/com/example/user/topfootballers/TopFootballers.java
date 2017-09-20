package com.example.user.topfootballers;

import java.util.ArrayList;

/**
 * Created by user on 20/09/2017.
 */

public class TopFootballers {

    private ArrayList<Footballer> list;

    public TopFootballers() {
        list = new ArrayList<Footballer>();
        list.add(new Footballer(1, "Cristiano Ronaldo", "Real Madrid"));
        list.add(new Footballer(2, "Lionel Messi", "Barcelona"));
        list.add(new Footballer(3, "Antoine Griezmann", "Athletico Madrid"));
        list.add(new Footballer(4, "Luis Suarez", "Barcelona"));
        list.add(new Footballer(5, "Neymar", "Barcelona"));
        list.add(new Footballer(6, "Gareth Bale", "Real Madrid"));
        list.add(new Footballer(7, "Riyad Mahrez", "Leicester City"));
        list.add(new Footballer(8, "Jamie Vardy", "Leicester City"));
        list.add(new Footballer(9, "Gianluigi Buffon", "Juventus"));
        list.add(new Footballer(10, "Pepe", "Real Madrid"));
        list.add(new Footballer(11, "Pierre-Emerick Aubameyang", "Borussia Dortmund"));
        list.add(new Footballer(12, "Rui Patricio", "Sporting Lisbon"));
        list.add(new Footballer(13, "Zlatan Ibrahimovic", "Manchester United"));
        list.add(new Footballer(14, "Arturo Vidal", "Bayern Munich"));
        list.add(new Footballer(15, "Paul Pogba", "Manchester United"));
        list.add(new Footballer(16, "Robert Lewandowski", "Bayern Muncih"));
        list.add(new Footballer(17, "Toni Kroos", "Real Madrid"));
        list.add(new Footballer(18, "Luka Modric", "Real Madrid"));
        list.add(new Footballer(19, "Dimitri Payet", "West Ham United"));
    }

    public ArrayList<Footballer> getList() {
        return new ArrayList<Footballer>(list);
    }
}
