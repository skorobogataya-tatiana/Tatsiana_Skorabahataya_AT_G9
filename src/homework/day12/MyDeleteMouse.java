package homework.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyDeleteMouse {
    //- в главном потоке создать коллекцию из 280 мышей, далее создать 5 дочерних потоков (например, в цикле for),
    // в каждом из которых удалять 1 пикающую мышь, пока коллекция не станет пустой
    static Object lock = new Object();

    public static void main(String[] args) {
        List<Mouse> mice = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            mice.add(new Mouse(i));
        }

        List<Mouse> syncMice = Collections.synchronizedList(mice);

        for (int j = 0; j < 5; j++) {
            final int threadId = j;
            new Thread(() -> {
                while (!syncMice.isEmpty()) {
                    Mouse removedMouse = (syncMice.remove(0));
                    synchronized (lock) {
                        System.out.print("Thread " + threadId + " ");
                        removedMouse.peep();
                    }
                }
            }).start();
        }
    }
}
