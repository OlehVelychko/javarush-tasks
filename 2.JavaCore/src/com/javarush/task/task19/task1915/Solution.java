package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(consoleStream);

        String fileName; // /Users/narsil/Desktop/test files/file_d

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            fileName = reader.readLine();
        }

        try (FileOutputStream outputStream1 = new FileOutputStream(fileName)) {
            outputStream1.write(outputStream.toByteArray());
        }

        String result = outputStream.toString();
        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

