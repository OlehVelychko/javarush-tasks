package com.javarush.task.jdk13.task05.task0520;

/* 
Заполнить класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top, left, width, height;

    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
    }

    public Rectangle(int left, int width, int height) {
        this.left = left;
        this.width = width;
        this.height = height;
        top = width;
    }

    public Rectangle(Rectangle rectangle) {
        rectangle.top = top;
        rectangle.left = left;
        rectangle.width = width;
        rectangle.height = height;
    }

    public static void main(String[] args) {

    }
}
