package com.javarush.task.jdk13.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {

    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> result = new HashMap<>();
        Cat cat1 = new Cat("qq");
        Cat cat2 = new Cat("ww");
        Cat cat3 = new Cat("ee");
        Cat cat4 = new Cat("rr");
        Cat cat5 = new Cat("tt");
        Cat cat6 = new Cat("yy");
        Cat cat7 = new Cat("uu");
        Cat cat8 = new Cat("ii");
        Cat cat9 = new Cat("oo");
        Cat cat10 = new Cat("pp");

        result.put(cat1.name, cat1);
        result.put(cat2.name, cat2);
        result.put(cat3.name, cat3);
        result.put(cat4.name, cat4);
        result.put(cat5.name, cat5);
        result.put(cat6.name, cat6);
        result.put(cat7.name, cat7);
        result.put(cat8.name, cat8);
        result.put(cat9.name, cat9);
        result.put(cat10.name, cat10);


        return result;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Collection<Cat> values = map.values();
        Set<Cat> setOfValues = new HashSet<>(values);

        return setOfValues;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        public String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Cat)) {
                return false;
            }
            Cat cat = (Cat) o;
            return Objects.equals(name, cat.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
