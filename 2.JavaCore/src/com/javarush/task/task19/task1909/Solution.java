package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            fileName1 = reader.readLine(); // /Users/narsil/Desktop/test files/file_a
            fileName2 = reader.readLine(); // /Users/narsil/Desktop/test files/file_d
        }

        /*try (FileReader fileReader = new FileReader(fileName1);
             FileWriter fileWriter = new FileWriter(fileName2)) {
            while (fileReader.ready()) {
                int data = fileReader.read();
                if (data == 46) {
                    data = 33;
                }
                fileWriter.write(data);
            }
        }*/

        /*try (FileReader fileReader = new FileReader(fileName1);
             FileWriter fileWriter = new FileWriter(fileName2)) {
            while (fileReader.ready()) {
                int data = fileReader.read();
                char symbol = (char) data;
                if (symbol == '!') {
                    symbol = '.';
                }
                fileWriter.write(symbol);
            }
        }*/

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))) {
            while (bufferedReader.ready()) {
                int data = bufferedReader.read();
                if (data == 46) {
                    data = 33;
                }
                bufferedWriter.write(data);
            }
        }
    }
}
