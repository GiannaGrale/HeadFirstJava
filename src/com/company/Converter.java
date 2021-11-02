package com.company;

import java.util.Scanner;

public class Converter {
    public static String toBinary(int x) {
        String binary = "";
        while (x > 0) {
            binary = (x % 2) + binary;
            x /= 2;
        }
        return binary;
    }

    public static class Program {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println(Converter.toBinary(x));
        }

    }
}