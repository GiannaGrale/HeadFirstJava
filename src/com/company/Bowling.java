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

    void getWinner2() {
        int maxValueInMap = (Collections.max(players.values()));  // This will return max value in the HashMap
        for (Map.Entry<String, Integer> entry : players.entrySet()) {  // Iterate through HashMap
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }
    }
}