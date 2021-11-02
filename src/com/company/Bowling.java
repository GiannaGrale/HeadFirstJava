package com.company;

import java.util.*;


public class Bowling {
    HashMap<String, Integer> players;

    public Bowling() {
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    void getWinner() {
        String max = Collections.max(players.entrySet(),
                Comparator.comparingInt(Map.Entry::getValue)).getKey();
        System.out.println(max);

    }
}