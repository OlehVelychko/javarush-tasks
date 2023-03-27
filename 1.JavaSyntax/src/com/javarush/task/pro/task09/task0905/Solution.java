package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int myPow = 0;
        double res = 0;
        if (decimalNumber > 0) {
            while (decimalNumber != 0) {
                res = res + (decimalNumber % 8) * Math.pow(10, myPow);
                decimalNumber /= 8;
                myPow += 1;
            }
            return (int) res;
        } else {
            return 0;
        }
    }

    public static int toDecimal(int octalNumber) {
        int myPow = 0;
        double res = 0;
        if (octalNumber > 0) {
            while (octalNumber != 0) {
                res = res + (octalNumber % 10) * Math.pow(8, myPow);
                octalNumber /= 10;
                myPow += 1;
            }
            return (int) res;
        } else {
            return 0;
        }
    }
}
