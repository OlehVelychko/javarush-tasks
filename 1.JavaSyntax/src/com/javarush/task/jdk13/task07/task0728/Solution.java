package com.javarush.task.jdk13.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам 5 7 2 1 6
                     7 5 2 1 6
                     7 5 2 6 1
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        int maxTemp;
        for (int i = 0; i < array.length - 1; i++) {
            maxTemp = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > maxTemp) {
                    maxTemp = array[j];
                    array[j] = array[i];
                    array[i] = maxTemp;
                }
            }
        }
    }
}
