package Yaniltmac;

public class MyThread2 extends Thread{
    final StringBuffer sentence;


    public MyThread2(StringBuffer sentence) {
        this.sentence = sentence;

    }

    @Override
    public void run() {
        super.run();

            String[] words1 = new String[]{" gordum", " derede", " kar", " kurku", " kirpi"};
            for (int i = 0; i < words1.length; i++) {
                sentence.append(words1[i]);
                System.out.println(sentence);
                try {
                    sleep(1000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println(sentence);

        }

}
