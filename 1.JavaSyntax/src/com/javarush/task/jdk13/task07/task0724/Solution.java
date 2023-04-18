package com.javarush.task.jdk13.task07.task0724;

/* 
Семья
*/

public class Solution {
    public static void main(String[] args) {
        Human human1 = new Human("Diana", false, 62);
        Human human2 = new Human("Masha", false, 92);
        Human human3 = new Human("Vitya", true, 70);
        Human human4 = new Human("Sasha", true, 101);
        Human human5 = new Human("Katya", false, 35, human4, human2);
        Human human6 = new Human("Lena", false, 25, human3, human1);
        Human human7 = new Human("Sergei", true, 30, human3, human2);
        Human human8 = new Human("Petya", true, 38, human4, human1);
        Human human9 = new Human("Vasya", true, 36, human3, human1);

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
        System.out.println(human9.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}