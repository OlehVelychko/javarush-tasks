package forTest.ThreadHardClew;

public class TestThread1_3 extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Ура");
                sleep(500);
            }
        } catch (InterruptedException exception) {

        }
    }
}
