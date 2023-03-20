package com.javarush.task.pro.task05.task0519;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

/* 
Есть ли кто?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);
        int index = binarySearch(copy, element);
        if (index < 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
