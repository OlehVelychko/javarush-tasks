package com.javarush.task.jdk13.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> countsList = new ArrayList<>();
        int maxSequence = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (Objects.equals(numbers.get(i), numbers.get(i + 1))) {
                count++;
                countsList.add(count);
            } else {
                count = 0;
            }
        }

        for (Integer thisCount : countsList) {
            if (thisCount > maxSequence) {
                maxSequence = thisCount;
            }
        }

        System.out.println(maxSequence + 1);
    }
}
