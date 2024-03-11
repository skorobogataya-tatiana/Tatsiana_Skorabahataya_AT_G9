package homework.day12;

import java.util.ArrayList;
import java.util.List;

public class MyMouseThreads2 {
    public static void main(String[] args) {
        //каждая четная пикает

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                List<Mouse> mice = new ArrayList<>();
                for (int j = 0; j < 18; j++) {
                    mice.add(new Mouse(j));
                }
                for (int n = 0; n < mice.size(); n++) {
                    if (n % 2 == 0)
                        mice.get(n).peep();
                }
            }).start();
        }
    }
}
