package com.javarush.task.jdk13.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> result = new HashMap<>();
        /*result.put("Иванов", "Саша");
        result.put("Иванов", "Сергей");
        result.put("Петров", "Вася");
        result.put("Петров", "Дмитрий");
        result.put("Сидоров", "Саша");
        result.put("Сидоров", "Кирилл");
        result.put("Анечкин", "Сергей");
        result.put("Анечкин", "Максим");
        result.put("Долбоёбов", "Вася");
        result.put("Долбоёбов", "Евгений");*/

        result.put("Смирнов", "Роман");
        result.put("Иванов", "Дмитрий");
        result.put("Кузнецов", "Арнольд");
        result.put("Соколов", "Роман");
        result.put("Попов", "Максим");
        result.put("Лебедев", "Ярослав");
        result.put("Новиков", "Александр");
        result.put("Козлов", "Михаил");
        result.put("Морозов", "Илья");
        result.put("Новиков", "Алексей");

        return result;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
