package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine(); // /Users/narsil/Desktop/test files/file_a
            fileName2 = reader.readLine(); // /Users/narsil/Desktop/test files/file_d
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))) {
            while (bufferedReader.ready()) {
                int data = bufferedReader.read();
                if (Character.isLetterOrDigit(data) || Character.isWhitespace(data) && data != '\n' && data != '\r') {
                    bufferedWriter.write(data);
                }
            }
        }
    }
}
