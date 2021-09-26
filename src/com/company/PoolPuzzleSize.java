package com.company;

public class PoolPuzzleSize {
    /***
     * Result:
     * a noise annoys an oyster
     *
     */
    public static void main(String[] args) {
        int x = 0;
        while (x < 1) {

            if (x < 1) {
                System.out.print("a ");
                System.out.print("n");
                x++;
            }

            if (x > 0) {
                System.out.print("oise ");
            }

            if (x == 1) {
                System.out.print("an");
                System.out.print("noys ");
                x = x + 2;
            }
            if (x > 1) {
                System.out.print("an");
                System.out.print(" oyster");

            }
            System.out.print(" ");

        }
    }
}
