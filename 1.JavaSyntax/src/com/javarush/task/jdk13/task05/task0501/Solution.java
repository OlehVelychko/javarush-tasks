package com.javarush.task.jdk13.task05.task0501;

/* 
Кошачья бойня(1)
*/

public class Solution {

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }


        public boolean fight(Cat fighterTwo) {
            int countBestCriterionFighterOne = 0; // создание счётчика всех лучших критерий для кота this
            int countBestCriterionFighterTwo = 0; // создание счётчика всех лучших критерий для кота с которым битва

            if (this.age != fighterTwo.age) {
                if (this.age > fighterTwo.age) { // сравнение каждого критерия... и дальше по аналогии
                    countBestCriterionFighterOne++; // добавление в счётчик в зависимости от сравнения... и дальше по аналогии
                } else {
                    countBestCriterionFighterTwo++;
                }
            }

            if (this.weight != fighterTwo.weight) {
                if (this.weight > fighterTwo.weight) {
                    countBestCriterionFighterOne++;
                } else {
                    countBestCriterionFighterTwo++;
                }
            }

            if (this.strength != fighterTwo.strength) {
                if (this.strength > fighterTwo.strength) {
                    countBestCriterionFighterOne++;
                } else {
                    countBestCriterionFighterTwo++;
                }
            }

            return countBestCriterionFighterOne > countBestCriterionFighterTwo; // возвращаем результат
        }
    }

    public static void main(String[] args) {
        Cat first = new Cat("Мурчик", 10, 1, 1);
        Cat second = new Cat("джерри", 1, 1, 1);
        Cat third = new Cat("Эйлин", 7, 8, 10);

        System.out.println(first.fight(second));
        System.out.println(second.fight(third));
        System.out.println(third.fight(first));
    }
}
