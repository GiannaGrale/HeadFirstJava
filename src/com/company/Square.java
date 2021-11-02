package com.company;

public class Square extends  Shape{
    int x;

    public Square(int x) {
        this.x = x;
    }

    @Override
    void area() {
        int sq = x*x;
        System.out.println(sq);
    }
}
