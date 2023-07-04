package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
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

        System.out.println(resultDigits(outputStream.toString()));
    }

    public static String resultDigits(String string) {
        String[] parts = string.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        String action = parts[1];
        int c = 0;

        switch (action) {
            case "+":
                c = a + b;
                break;
            case "*":
                c = a * b;
                break;
            case "-":
                c = a - b;
                break;
        }

        return string.trim() + " " + c;
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

