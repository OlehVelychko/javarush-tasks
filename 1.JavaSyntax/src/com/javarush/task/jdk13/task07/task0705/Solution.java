package com.javarush.task.jdk13.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] big = new int[20];
        int[] small11 = new int[10];
        int[] small12 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < big.length; i++) {
            big[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < small11.length; i++) {
            small11[i] = big[i];
        }
        for (int i = 0; i < small12.length; i++) {
            small12[i] = big[i + small12.length];
        }
        for (int i = 0; i < small12.length; i++) {
            System.out.println(small12[i]);
        }
    }
}
