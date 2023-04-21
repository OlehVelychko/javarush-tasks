package com.javarush.task.jdk13.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые имя и фамилия
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Смирнов", "Сильвестр");
        map.put("Иванов", "Дмитрий");
        map.put("Кузнецов", "Арнольд");
        map.put("Соколов", "Роман");
        map.put("Попов", "Максим");
        map.put("Лебедев", "Ярослав");
        map.put("Новиков", "Александр");
        map.put("Козлов", "Михаил");
        map.put("Морозов", "Илья");
        map.put("Петров", "Алексей");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int countFirstName = 0;
        for (String nameTmp : map.values()) {
            if (nameTmp.equals(name)) {
                countFirstName++;
            }
        }

        return countFirstName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countLastName = 0;
        for (String nameTmp : map.keySet()) {
            if (nameTmp.equals(lastName)) {
                countLastName++;
            }
        }

        return countLastName;
    }

    public static void main(String[] args) {

    }
}
