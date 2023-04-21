package com.javarush.task.jdk13.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Удалить людей, имеющих одинаковые имена
*/

/*public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Смирнов", "Сильвестр");
        map.put("Иванов", "Алексей");
        map.put("Кузнецов", "Арнольд");
        map.put("Соколов", "Михаил");
        map.put("Попов", "Алексей");
        map.put("Лебедев", "Ярослав");
        map.put("Новиков", "Александр");
        map.put("Козлов", "Михаил");
        map.put("Морозов", "Илья");
        map.put("Петров", "Алексей");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> outerPair : copy.entrySet()) {
            for (Map.Entry<String, String> innerPair : copy.entrySet()) {
                if (outerPair.getKey().equals(innerPair.getKey())) {
                    continue;
                }
                if (outerPair.getValue().equals(innerPair.getValue())) {
                    removeItemFromMapByValue(map, outerPair.getValue());
                }
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        *//*Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);*//*
    }
}*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Solution {
    public static Map<String, Calendar> createMap() throws ParseException {
//        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Calendar> map = new HashMap<>();
        map.put("Сталлоне", new GregorianCalendar(2012, Calendar.MAY, 1));
        map.put("Арни", new GregorianCalendar(2012, Calendar.JUNE, 1));
        map.put("Джеки", new GregorianCalendar(2012, Calendar.JANUARY, 1));
        map.put("Балетмейстер", new GregorianCalendar(2012, Calendar.FEBRUARY, 1));
        map.put("Дольф", new GregorianCalendar(2012, Calendar.DECEMBER, 1));
        map.put("Олег", new GregorianCalendar(2012, Calendar.MAY, 1));
        map.put("Валера", new GregorianCalendar(2012, Calendar.AUGUST, 1));
        map.put("Алиса", new GregorianCalendar(2012, Calendar.SEPTEMBER, 1));
        map.put("Рита", new GregorianCalendar(2012, Calendar.DECEMBER, 1));
        map.put("Мама", new GregorianCalendar(2012, Calendar.JULY, 1));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Calendar> map) {
        Map<String, Calendar> copy = new HashMap<>(map);
        for (Map.Entry<String, Calendar> entry : copy.entrySet()) {
            int birthMonth = entry.getValue().get(Calendar.MONTH);
            if (birthMonth >= Calendar.MAY && birthMonth <= Calendar.AUGUST) {
                map.remove(entry.getKey());
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Calendar> map = createMap();
        System.out.println("Исходный список людей: ");
        System.out.println();
        for (Map.Entry<String, Calendar> entry : map.entrySet()) {
            DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
            System.out.println(entry.getKey() + ": " + dateFormat.format(entry.getValue().getTime()));
        }

        System.out.println();

        removeAllSummerPeople(map);

        System.out.println("Список людей после удаления летних дней рождения: ");
        System.out.println();
        for (Map.Entry<String, Calendar> entry : map.entrySet()) {
            DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
            System.out.println(entry.getKey() + ": " + dateFormat.format(entry.getValue().getTime()));
        }
    }
}

