package forTest;

/*public class TestThread {
    public static void main(String[] args) {
        Thread thread = new Thread();
        try {
            System.out.println("второстепенный поток начался");
            Thread.sleep(2000);
            System.out.println("Поток завершён");
        } catch (InterruptedException e) {
            System.out.println("поток был прерван");
        }

        thread.start();

        try {
            thread.join();
            System.out.println("поток завершён и присоединён");
        } catch (InterruptedException e) {
            System.out.println("Главный поток был прерван");
        }
    }
}*/

public class TestThread {
    public static void main(String[] args) {
        Thread secondaryThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // Код второстепенного потока
                    Thread.sleep(1500);
                    System.out.println("Второстепенный поток завершен");
                } catch (InterruptedException e) {
                    System.out.println("Второстепенный поток был прерван");
                }
            }
        });

        secondaryThread.start(); // Запуск второстепенного потока

        // Код главного потока
        System.out.println("Начало выполнения главного потока");

        try {
            System.out.println("начинаем ждать join");
            secondaryThread.join(); // Ожидание завершения второстепенного потока
            Thread.sleep(1500);
            System.out.println("Второстепенный поток завершен и присоединен");
        } catch (InterruptedException e) {
            System.out.println("Главный поток был прерван");
        }

        System.out.println("Завершение выполнения главного потока");
    }
}


/*public class TestThread implements Runnable {
    public static void main(String[] args) {
        Thread secondaryThread = new Thread(new TestThread());

        secondaryThread.start(); // Запуск второстепенного потока

        // Код главного потока
        System.out.println("Начало выполнения главного потока");

        try {
            secondaryThread.join(); // Ожидание завершения второстепенного потока
            System.out.println("Второстепенный поток завершен и присоединен");
        } catch (InterruptedException e) {
            System.out.println("Главный поток был прерван");
        }

        System.out.println("Завершение выполнения главного потока");
    }

    @Override
    public void run() {
        try {
            // Код второстепенного потока
            Thread.sleep(2000);
            System.out.println("Второстепенный поток завершен");
        } catch (InterruptedException e) {
            System.out.println("Второстепенный поток был прерван");
        }
    }
}*/

