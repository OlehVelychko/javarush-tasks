package forTest.Thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadPlayers {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
        Thread.sleep(5000); // Ждем 5 секунд
        onlineGame.interrupt();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = new ArrayList<String>();

        static {
            steps.add("Начало игры");
            steps.add("Сбор ресурсов");
            steps.add("Рост экономики");
            steps.add("Убийство врагов");
        }

        protected Gamer gamer1 = new Gamer("Ivanov", 3);
        protected Gamer gamer2 = new Gamer("Petrov", 1);
        protected Gamer gamer3 = new Gamer("Sidorov", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            /*try {
                for (String step : steps) {
                    System.out.println(step);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Игра прервана");
            }

            isWinnerFound = true;*/
        }
    }

    public static class Gamer extends Thread {
        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        public void run() {
            try {
                for (String step : OnlineGame.steps) {
                    System.out.println(getName() + ":" + step);
                    Thread.sleep(1000 / rating);
                }
            } catch (InterruptedException e) {
                System.out.println(getName() + ":проиграл");
            }

            if (OnlineGame.isWinnerFound) {
                System.out.println(getName() + ":проиграл");
            } else {
                System.out.println(getName() + ":победитель!");
                OnlineGame.isWinnerFound = true;
            }
        }
    }
}

