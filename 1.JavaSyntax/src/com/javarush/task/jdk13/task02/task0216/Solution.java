package com.javarush.task.jdk13.task02.task0216;

/* 
Минимум трех чисел
*/

public class Solution {
    public static int min(int a, int b, int c) {
//        int min = a;
//        if (a < b) {
//            if (a < c) { // for ELSE a > c AND a < b
//                min = a;
//            } else {
//                min = c;
//            }
//        } else { // for ELSE b < a
//            if (b < c) {
//                min = b;
//            } else {
//                min = c;
//            }
//        }

        return a < b ? Math.min(a, c) : Math.min(b, c);

//        return min;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
