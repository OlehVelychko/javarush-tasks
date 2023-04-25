package com.javarush.task.jdk13.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Список из массивов чисел
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> result = new ArrayList<>();
        int[] list1 = new int[]{1, 2, 3, 5, 4};
        int[] list2 = new int[]{2, 1};
        int[] list3 = new int[]{4, 3, 2, 1};
        int[] list4 = new int[]{7, 6, 5, 4, 3, 2, 1};
        int[] list5 = new int[0];
        Collections.addAll(result, list1, list2, list3, list4, list5);

        return result;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            System.out.println(Arrays.toString(array));
        }
    }
}