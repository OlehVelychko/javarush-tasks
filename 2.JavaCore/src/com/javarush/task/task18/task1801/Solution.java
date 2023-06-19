package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine(); // /Users/narsil/Documents/file_a
        FileInputStream inputStream = new FileInputStream(fileName);
        int maxData = inputStream.read();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data > maxData) {
                maxData = data;
            }
        }

        inputStream.close();

        System.out.println(maxData);
    }
}
