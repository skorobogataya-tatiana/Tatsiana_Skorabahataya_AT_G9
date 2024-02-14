package homework.day5.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection() {

        Random random = new Random();
        String direction = "";
        int x = random.nextInt(39) + 1;

        if (x < 10) {
            direction = "NORTH";
        } else if (x > 9 && x < 20) {
            direction = "SOUTH";
        } else if (x > 19 && x < 30) {
            direction = "WEST";
        } else if (x > 29 && x < 40) {
            direction = "EAST";
        }
        return direction;
    }
}
