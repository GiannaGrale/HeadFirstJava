package com.company;

import java.util.Iterator;
import java.util.Scanner;

public class Winner {
    public static void main(String[] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for (int i =0; i<3; i++){
            String input = sc.nextLine();
            String [] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);

            System.out.println();
        }


        game.getWinner();
        game.getWinner2();
    }
}
