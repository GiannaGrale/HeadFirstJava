package com.company;

public class Bottles {

    public static void main(String[] args) {
        int beerNum = 3;
        String word = "bottles";

        while (beerNum > 0) {
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.print("Take one down. ");
            System.out.println("Pass it around!");
            beerNum--;

            if (beerNum == 1) {
                word = "bottle";
            } else if (beerNum == 0) {
                System.out.println("No bottles on the wall!");
            }
        }
    }
}
