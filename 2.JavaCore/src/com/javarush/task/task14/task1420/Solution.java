package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД 7 and 17
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(bufferedReader.readLine());
        int number2 = Integer.parseInt(bufferedReader.readLine());
        int result = 1;

        int minNUmber = Math.min(number1, number2);

        for (int i = minNUmber; i > 1; i--) {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
