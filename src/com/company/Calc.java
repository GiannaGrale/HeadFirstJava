package com.company;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int x = 1;

        while (x <= 3) {
            int r = amount / 10;
            amount = amount - r;
            x++;

        }
        System.out.println(amount);

    }

}
