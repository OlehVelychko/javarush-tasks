package com.javarush.task.jdk13.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строк в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] words = new String[10];
        int neededLength = 8;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < neededLength; i++) {
            words[i] = reader.readLine();

        }
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}