package homework.day12;

import java.util.ArrayList;
import java.util.List;

public class MyDeleteMouse {

    static Object lock = new Object();

    public static void main(String[] args) {
        List mice = new ArrayList<>();
        for (int i = 0; i < 280; i++) {
            mice.add(new Mouse(i));
        }

        for (int j = 0; j < 5; j++) {
            new Thread(() -> {
                synchronized (lock) {
                    while (mice.size() != 0) {
                        if (mice.size() != 0) {
                            Mouse removedMouse = (Mouse) (mice.remove(0));
                            removedMouse.peep();
                        }
                    }
                }
            }).start();
        }
    }
}
