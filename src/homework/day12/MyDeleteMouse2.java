package homework.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyDeleteMouse2 {
    //- в главном потоке создать коллекцию из 380 мышей, далее создать 7 дочерних потоков (например, в цикле for),
    // в каждом из которых каджые 250мс удалять 1 пикающую мышь, пока коллекция не станет пустой
    static Object lock = new Object();

    public static void main(String[] args) {
        List mice = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            mice.add(new Mouse(i));
        }

        List<Mouse> syncMice = Collections.synchronizedList(mice);

        for (int j = 0; j < 7; j++) {
            final int threadId = j;
            new Thread(() -> {

                while (!syncMice.isEmpty()) {
                    synchronized (lock) {
                        if (!syncMice.isEmpty()) {
                            Mouse removedMouse = (syncMice.remove(0));
                            System.out.print("Thread " + threadId + " ");
                            removedMouse.peep();
                            try {
                                Thread.sleep(250);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }).start();
        }
    }
}
