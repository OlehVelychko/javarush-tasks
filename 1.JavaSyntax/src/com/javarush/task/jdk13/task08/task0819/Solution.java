package com.javarush.task.jdk13.task08.task0819;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Cat catToRemove = cats.iterator().next();
        cats.remove(catToRemove);

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        result.add(cat1);
        result.add(cat2);
        result.add(cat3);

        return result;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        public Cat() {

        }
    }
}
