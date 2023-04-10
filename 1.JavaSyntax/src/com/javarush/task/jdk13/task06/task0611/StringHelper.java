package com.javarush.task.jdk13.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    /*public static String multiply(String text) {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += text;
        }
        return result;
    }

    public static String multiply(String text, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += text;
        }
        return result;
    }*/

    public static String multiply(String text) {
        return multiply(text, 5);
    }

    public static String multiply(String text, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(text);
        }
        return result.toString();
    }

    public static void main(String[] args) {

    }
}
