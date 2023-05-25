package forTest.ThreadHardClew;

public class TestThreadStart {
    public static void main(String[] args) throws InterruptedException {
        /**
         * test for MyThread1
         *
         * status: complete
         */
        /*Thread thread1_1 = new TestThread1_1();
        thread1_1.start();*/

        /**
         * test fot MyThread2
         *
         * status: complete
         */
        /*Thread thread1_2 = new TestThread1_2();
        thread1_2.start();
        thread1_2.interrupt();*/

        /**
         * test fot MyThread3
         *
         * status: complete
         */
        /*Thread thread1_3 = new TestThread1_3();
        thread1_3.start();*/

        /**
         * test fot MyThread4
         *
         * status: maybe
         */
        /*Thread thread1_4 = new TestThread1_4();
        thread1_4.start();*/

        /**
         * test fot MyThread5
         *
         * status: maybe
         */
        Thread thread1_5 = new TestThread1_5();
        thread1_5.start();
    }
}
