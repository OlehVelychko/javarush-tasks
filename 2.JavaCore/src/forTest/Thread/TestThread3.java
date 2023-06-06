package forTest.Thread;

public class TestThread3 {
    public static void main(String[] args) throws InterruptedException {
        class Clock implements Runnable {
            @Override
            public void run() {
                Thread current = Thread.currentThread();

                try {
                    while (!current.isInterrupted()) {
                        System.out.println("Tik");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    // Обработка прерывания
                    System.out.println("Поток прерван");
                }
            }
        }

        Thread clock = new Thread(new Clock());
        clock.start();

        Thread.sleep(5000);
        clock.interrupt();
    }
}
