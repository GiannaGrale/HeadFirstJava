package com.company;

public class Circle extends Shape{
    int y;

    public Circle(int y) {
        this.y = y;
    }

    @Override
    void area() {
      double sq =  Math.PI * y * y;
        System.out.println(sq);
    }
}
