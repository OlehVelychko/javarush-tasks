package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // enter fileName
        String fileName = reader.readLine(); // /Users/narsil/Documents/file_a
        FileInputStream inputStream = new FileInputStream(fileName);
        int minData = inputStream.read();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data < minData) {
                minData = data;
            }
        }
        inputStream.close();

        System.out.println(minData);
    }
}
