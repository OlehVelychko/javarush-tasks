package com.javarush.task.jdk13.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Два массива
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] words = new String[10];
        int[] numbers = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < words.length; i++) {
            words[i] = reader.readLine();
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = words[i].length();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
