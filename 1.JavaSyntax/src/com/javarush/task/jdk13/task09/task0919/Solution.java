package com.javarush.task.jdk13.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void divideByZero() {
        int a = 5 / 0;
        System.out.println(a);
    }

}

