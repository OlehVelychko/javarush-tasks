package com.javarush.task.jdk13.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String mama = "Мама";
        String mila = "Мыла";
        String ramy = "Раму";

        System.out.printf("%1$s%2$s%3$s\n" +
                "%1$s%3$s%2$s\n" +
                "%2$s%1$s%3$s\n" +
                "%2$s%3$s%1$s\n" +
                "%3$s%1$s%2$s\n" +
                "%3$s%2$s%1$s", mama, mila, ramy);
    }
}
