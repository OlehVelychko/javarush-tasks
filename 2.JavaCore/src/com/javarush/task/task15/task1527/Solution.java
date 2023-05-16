package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        ArrayList<String> listPar;
        listPar = getPairParameter(url, "&");

        /*ArrayList<String> nextRes = getNameParameter(listPar);
        System.out.println(nextRes);*/

        Map<String, String> nextMap = fromListToMap(listPar);
        System.out.println();
        for (Map.Entry<String, String> entry : nextMap.entrySet()) {
            if (entry.getKey().equals("obj")) {
                try {
                    double doubleValue = Double.parseDouble(entry.getValue());
                    alert(doubleValue);
                } catch (Exception e) {
                    alert(entry.getValue());
                }
            } 
        }
    }

    /*вытаскивает из URL
    пары параметров и их значений

    возвращает в виде списка*/
    public static ArrayList<String> getPairParameter(String parameterInURL, String symbol) {
        ArrayList<String> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder(parameterInURL);
        int firstIndexDrop = builder.indexOf("?");

        StringBuilder pairParameter = new StringBuilder(builder.substring(firstIndexDrop + 1));

        do {
            int lastIndexDrop = pairParameter.indexOf(symbol);
            result.add(pairParameter.substring(0, lastIndexDrop));
            pairParameter.delete(0, lastIndexDrop + 1);
        } while (pairParameter.toString().contains(symbol));

        result.add(pairParameter.toString());

        return result;
    }

    /*тут я тупанул, из списка просто имена параметров вытащил. Удалять не стал метод, жалко

    возвращает в виде списка*/
    public static ArrayList<String> getNameParameter(ArrayList<String> needToSplit) {
        ArrayList<String> result = new ArrayList<>();
        for (String pair : needToSplit) {
            StringBuilder builder = new StringBuilder(pair);
            if (builder.indexOf("=") != -1) {
                builder.delete(builder.indexOf("="), builder.length());
                result.add(builder.toString());
            } else {
                result.add(builder.toString());
            }
        }

        return result;
    }

    /*преобразует список параметров в словарь где у каждого ключа своё значение

    возвращает в виде словаря*/
    public static Map<String, String> fromListToMap(ArrayList<String> list) {
        Map<String, String> result = new HashMap<>();
        String key;
        String value;

        for (String pair : list) {
            if (pair.contains("=")) {
                key = pair.substring(0, pair.indexOf("="));
                value = pair.substring(pair.indexOf("=") + 1);
            } else {
                key = pair;
                value = null;
            }
            result.put(key, value);
            System.out.print(key + " ");
        }

        return result;
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
