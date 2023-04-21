package com.javarush.task.jdk13.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(35);
        set.add(22);
        set.add(5);
        set.add(8);
        set.add(23);
        set.add(0);
        set.add(57);
        set.add(9);
        set.add(4);
        set.add(24);
        set.add(56);
        set.add(343);
        set.add(3);
        set.add(54657);
        set.add(6);
        set.add(6888);
        set.add(45646);
        set.add(1);
        set.add(7);

        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> copy = new HashSet<>(set);
        for (Integer number : copy) {
            if (number > 10) {
                set.remove(number);
            }
        }
    }

    public static void main(String[] args) {
    }
}
