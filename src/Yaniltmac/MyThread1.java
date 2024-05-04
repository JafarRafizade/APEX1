package Yaniltmac;

public class MyThread1 extends Thread {

    final StringBuffer sentence;


    public MyThread1(StringBuffer sentence) {
        this.sentence = sentence;

    }

    @Override
    public void run() {
        super.run();



            String[] words1 = new String[]{"Getdim", " bir", " 2", " kor", " yirtiq", " var"};
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
