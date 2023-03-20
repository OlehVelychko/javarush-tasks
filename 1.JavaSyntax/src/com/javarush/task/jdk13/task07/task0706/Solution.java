package com.javarush.task.jdk13.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улица и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int sumInhabitantsEven = 0;
        int sumInhabitantsNotEven = 0;
        int[] houses = new int[15];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < houses.length; i++) {
            houses[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0) {
                sumInhabitantsEven += houses[i];
            } else {
                sumInhabitantsNotEven += houses[i];
            }
        }

        if (sumInhabitantsEven > sumInhabitantsNotEven) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        if (sumInhabitantsEven < sumInhabitantsNotEven) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
