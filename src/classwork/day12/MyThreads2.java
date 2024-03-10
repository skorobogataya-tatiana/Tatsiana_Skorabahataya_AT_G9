package classwork.day12;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class MyThreads2 {

    public static synchronized void heavyMethod() {
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000_000; i++) {
            double d = tan(atan(123456789.123456789));
        }
        System.out.printf("I am %s, and I have finished in %s millis \r\n",
                Thread.currentThread().getName(),
                (System.currentTimeMillis() - t0));
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> heavyMethod());
        Thread t2 = new Thread(() -> heavyMethod());
        Thread t3 = new Thread(() -> heavyMethod());

        t1.start();
        /*try {
            t1.join();
        } catch(InterruptedException e) {
            System.out.println(e);
        }*/

        t2.start();
        /*try {
            t2.join();
        } catch(InterruptedException e) {
            System.out.println(e);
        }*/

        t3.start();
       /* try {
            t3.join();
        } catch(InterruptedException e) {
            System.out.println(e);
        }*/
    }
}
