package forTest;

import com.javarush.task.jdk13.task05.task0517.Cat;

import java.util.Arrays;

public class SuperAnimal {
    String brain;
    String heart;

    public SuperAnimal(String brain, String heart) {
        this.brain = brain;
        this.heart = heart;
    }

    public static class SuperCat extends SuperAnimal {
        String tail;

        public SuperCat(String brain, String heart, String tail) {
            super(brain, heart);
            this.tail = tail;
        }
    }

    public static void main(String[] args) {
        SuperCat catAlices = new SuperCat("большой мозг", "сильное", "трубой");
        System.out.println(catAlices.heart);
    }
}
