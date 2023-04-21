package com.javarush.task.jdk13.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Налоговая и зарплаты
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Rita", 1500);
        map.put("Oleh", 4000);
        map.put("Alice", 20);
        map.put("Papa", 0);
        map.put("Mama", 1100);
        map.put("Valera", 3000);
        map.put("Katya", 400);
        map.put("Sofia", 1300);
        map.put("Sonya", 450);
        map.put("Ruslan", 500);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        int requiredSalary = 500;
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < requiredSalary) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        removeItemFromMap(map);
        System.out.println("Налоговая в действии )))");
        System.out.println();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}