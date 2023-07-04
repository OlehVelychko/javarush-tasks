package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine(); // /Users/narsil/Desktop/test files/file_a
        String fileName2 = reader.readLine(); // /Users/narsil/Desktop/test files/file_d

        try (FileReader fileReader = new FileReader(fileName1);
             FileWriter fileWriter = new FileWriter(fileName2)) {
            int count = 1;
            while (fileReader.ready()) {
                int data = fileReader.read();
                if (count % 2 == 0) {
                    fileWriter.write(data);
                }
                count++;
            }
        }

        reader.close();
    }
}
