package Yaniltmac;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        StringBuffer sentence = new StringBuffer("");
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                String[] words1 = new String[]{"Getdim", " bir", " 2", " kor", " yirtiq", " var"};
                for (int i = 0; i < words1.length; i++) {
                    sentence.append(words1[i]);
                    try {
                        sleep(300);
                        lock.notify();
                        lock.wait(300);




                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }

                System.out.println(sentence);


            }



        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                String[] words1 = new String[]{" gordum", " derede", " kar", " kurku", " kirpi"};
                for (int i = 0; i < words1.length; i++) {
                    sentence.append(words1[i]);
                    try {
                        sleep(300);
                      lock.notify();
                      lock.wait(300);


                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.out.println(sentence);
            }

        });
        t1.start();
//        t1.join();
        t2.start();
//        t2.join();
//        MyThread1 myThread1 = new MyThread1(sentence);
//        MyThread2 myThread2 = new MyThread2(sentence);
//        myThread1.start();
//        myThread1.join(500);
//        myThread2.start();
//        myThread2.join(500);

    }
}
