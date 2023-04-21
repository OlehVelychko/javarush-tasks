package com.javarush.task.jdk13.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Удалить всех людей, родившихся летом
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Арни", dateFormat.parse("June 1 2012"));
        map.put("Джеки", dateFormat.parse("January 1 2012"));
        map.put("Балетмейстер", dateFormat.parse("February 1 2012"));
        map.put("Дольф", dateFormat.parse("December 1 2012"));
        map.put("Олег", dateFormat.parse("MAY 1 2012"));
        map.put("Валера", dateFormat.parse("August 1 2012"));
        map.put("Алиса", dateFormat.parse("September 1 2012"));
        map.put("Рита", dateFormat.parse("December 1 2012"));
        map.put("Мама", dateFormat.parse("July 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copy = new HashMap<>(map);
        for (Map.Entry<String, Date> entry : copy.entrySet()) {
            Date birthday = entry.getValue();
            int birthMonth = birthday.getMonth();
            if (birthMonth >= 5 && birthMonth <= 7) {
                map.remove(entry.getKey());
            }
        }
    }


    public static void main(String[] args) throws ParseException {
        /*Map<String, Date> map = createMap();
        System.out.println("Исходный список людей: ");
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        removeAllSummerPeople(map);

        System.out.println("Список людей после удаления летних дней рождения: ");
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }*/

    }
}