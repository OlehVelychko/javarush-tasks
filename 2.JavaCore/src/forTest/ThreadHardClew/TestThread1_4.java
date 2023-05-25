package forTest.ThreadHardClew;

public class TestThread1_4 extends Thread implements TestMessage {
    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                showWarning();
                sleep(1);
            } catch (InterruptedException exception) {
                interrupt();
            }
        }
    }

    @Override
    public void showWarning() {
        System.out.println("Угроза!");
        interrupt();
    }

}