package forTest.ThreadHardClew;

public class TestThread1_2 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException exception) {
            System.out.println("InterruptedException");
        }
    }
}
