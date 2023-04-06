package com.javarush.task.jdk13.task05.task0526;

/*
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Oleh", 33, "Dnipro");
        Woman woman = new Woman("Marharyta", 34, "Dnipro");
        Man man2 = new Man("Victor", 0, "Dnipro");
        Woman woman2 = new Woman("Alice", 0, "Dnipro");

        System.out.println(man);
        System.out.println(man2);
        System.out.println(woman);
        System.out.println(woman2);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return (name + " " + age + " " + address);
        }
    }


    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return (name + " " + age + " " + address);
        }
    }
}