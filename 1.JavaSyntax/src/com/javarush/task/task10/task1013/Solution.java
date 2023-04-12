package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name, sex, address;
        private int age, weight;
        private boolean isGood;

        public Human() {
        }

        public Human(String name) {
            this.name = name;
        }
        public Human(String name, String sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, String sex, String address) {
            this.name = name;
            this.sex = sex;
            this.address = address;
        }

        public Human(Human human) {
            human.name = "Alice";
            human.isGood = true;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(int age, int weight) {
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(boolean isGood) {
            this.isGood = isGood;
        }

        public Human(String name, boolean isGood) {
            this.name = name;
            this.isGood = isGood;
        }
    }
}
