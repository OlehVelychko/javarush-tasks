package forTest.SynchronizedAndYield;

public class ThreadExampleYield extends Thread {
    public ThreadExampleYield() {
        this.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " уступает свое место другим");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + " has finished executing.");
    }

    public static void main(String[] args) {
        new ThreadExampleYield();
        new ThreadExampleYield();
        new ThreadExampleYield();
    }
}
