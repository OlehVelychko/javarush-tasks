package com.javarush.task.jdk13.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самое большое число
*/

public class Solution {

    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            integers.add(Integer.parseInt(reader.readLine()));
            if (integers.get(i) > maxValue) {
                maxValue = integers.get(i);
            }
        }

        System.out.println(maxValue);
    }
}
