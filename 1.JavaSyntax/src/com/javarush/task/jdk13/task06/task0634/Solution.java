package com.javarush.task.jdk13.task06.task0634;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Шахматная доска
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        array = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        array[i][j] = '#';
                    } else {
                        array[i][j] = ' ';
                    }
                } else {
                    if (j % 2 != 0) {
                        array[i][j] = '#';
                    } else {
                        array[i][j] = ' ';
                    }
                }
            }
        }


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
