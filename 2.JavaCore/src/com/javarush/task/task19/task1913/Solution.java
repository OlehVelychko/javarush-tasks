package com.javarush.task.task19.task1913;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Выводим только цифры
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(consoleStream);

        System.out.println(getDigitsFromString(outputStream.toString()));
    }

    public static String getDigitsFromString(String string) {
        StringBuilder digits = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isDigit(c)) {
                digits.append(c);
            }
        }

        return digits.toString();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
