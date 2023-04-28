package com.javarush.task.task12.task1205;

/* 
Определимся с животным
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String typeObject = o.getClass().getSimpleName();
        String result = "";
        if (typeObject.equals("Cow")) {
            result = "Корова";
        } else if (typeObject.equals("Dog")) {
            result = "Собака";
        } else if (typeObject.equals("Whale")) {
            result = "Кит";
        } else {
            result = "Неизвестное животное";
        }

        return result;
    }
        /*String typeObject = o.getClass().getSimpleName();
        String result = switch (typeObject) {
            case "Cow" -> "Корова";
            case "Dog" -> "Собака";
            case "Whale" -> "Кит";
            default -> "Неизвестное животное";
        };

        return result;*/
//    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
