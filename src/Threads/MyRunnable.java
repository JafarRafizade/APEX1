package Threads;

public class MyRunnable implements Runnable{
    Object lock = new Object();
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println();
            }

        }
    }
}
