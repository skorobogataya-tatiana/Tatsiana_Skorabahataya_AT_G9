package homework.day5.playground.utils;

import java.util.Random;

public class DistanceGenerator {

    public static int generateDistance() {
        Random random = new Random();
        int distance = random.nextInt(99) + 1;
        System.out.printf("DistanceGenerator: I have generated distance with value: %d", distance).println();
        return distance;
    }
}
