package homework.day12;

import java.util.ArrayList;
import java.util.List;

public class MyDeleteMouse {
    //- в главном потоке создать коллекцию из 280 мышей, далее создать 5 дочерних потоков (например, в цикле for),
    // в каждом из которых удалять 1 пикающую мышь, пока коллекция не станет пустой
    static Object lock = new Object();

    public static void main(String[] args) {
        List mice = new ArrayList<>();
        for (int i = 0; i < 280; i++) {
            mice.add(new Mouse(i));
        }

        for (int j = 0; j < 5; j++) {
            new Thread(() -> {
                synchronized (lock) {
                    while (!mice.isEmpty()) {
                        if (!mice.isEmpty()) {
                            Mouse removedMouse = (Mouse) (mice.remove(0));
                            removedMouse.peep();
                        }
                    }
                }
            }).start();
        }
    }
}
