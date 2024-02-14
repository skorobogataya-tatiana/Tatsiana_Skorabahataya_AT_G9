package homework.day5.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {
    public static int generateCoordinate() {
        Random random = new Random();
        String direction = "";
        int x = random.nextInt(79) + 1;
        System.out.println("CoordinatesGenerator: I have generated point with value: " + x);
        return x;
    }
}
