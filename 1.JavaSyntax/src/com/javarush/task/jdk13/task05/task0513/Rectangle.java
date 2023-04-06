package com.javarush.task.jdk13.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int left;
    int top;
    int width;
    int height;

    public void initialize(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int height) {
        this.left = left;
        this.height = height;
    }

    public void initialize(int left, int width, int height) {
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(Rectangle rectangle) {
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }


    public static void main(String[] args) {

    }
}
