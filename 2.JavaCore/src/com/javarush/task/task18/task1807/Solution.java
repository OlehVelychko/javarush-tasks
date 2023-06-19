package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine(); // /Users/narsil/Documents/file_a
        FileInputStream inputStream = new FileInputStream(fileName);

        int commaValue = 44;
        int countComma = 0;

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data == commaValue) {
                countComma++;
            }
        }

        inputStream.close();

        System.out.println(countComma);
    }
}
