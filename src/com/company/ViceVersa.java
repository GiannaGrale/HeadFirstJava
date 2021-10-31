package com.company;

import java.util.Scanner;

public class ViceVersa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] myArray = text.toCharArray();

        for (int i = 0; i < myArray.length / 2; i++) {
            char temp = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = temp;


        }
        System.out.println(myArray);

    }

}