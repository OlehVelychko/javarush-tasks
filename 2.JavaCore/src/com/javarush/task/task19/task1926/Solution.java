package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) {
        String fileName = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            fileName = reader.readLine();
        } catch (IOException exception) {

        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                    StringBuilder reversed = new StringBuilder(line).reverse();
                    String newLine = reversed.toString();
                    System.out.println(newLine);
            }
        } catch (IOException exception) {

        }
    }
}
