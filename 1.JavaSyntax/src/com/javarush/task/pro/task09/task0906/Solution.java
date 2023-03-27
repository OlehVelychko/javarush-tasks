package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber > 0) {
            int res = 0;
            while (decimalNumber != 0) {
                res =  decimalNumber % 2;
                decimalNumber /= 2;
            }
            return String.valueOf(res);
        } else {
            return "";
        }
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber.equals("") || binaryNumber == null) {
            int res = 0;
            for (int i = 0; i < binaryNumber.length(); i++) {
                res = (int) (res + (binaryNumber.charAt(binaryNumber.length() - i - 1) - '0') * Math.pow(2, i));
            }
            return (int) res;
        } else {
            return 0;
        }
    }
}
