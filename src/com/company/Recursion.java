package com.company;

public class Recursion {
    public static void main(String[] args) {

        int x = 4;
        fibonachi(x);
    }

    static int fibonachi(int n) {

        if (n == 0) {
            System.out.println("first");
            return 0;
        }
        if (n == 1) {
            System.out.println("second");
            return 1;
        } else {
            System.out.println("third");
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }
}
