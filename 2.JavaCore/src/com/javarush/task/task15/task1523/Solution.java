package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    String name;
    int age, weight;
    boolean good;


    private Solution(String name) {
        this.name = name;
    }

    public Solution(int age) {
        this.age = age;
    }

    protected Solution(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    Solution(boolean good) {
        this.good = good;
    }

    public static void main(String[] args) {

    }
}

