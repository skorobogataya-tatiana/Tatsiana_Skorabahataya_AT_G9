package project.usage;

import project.boxing.Bottle;
import project.content.SparklingWater;

public class Factory {
    public static void main(String[] args) throws InterruptedException {
        Bottle bottle1 = new Bottle(0.05);
        Bottle bottle2 = new Bottle(0.1);
        Bottle bottle3 = new Bottle(0.2);

        bottle1.setWater(new SparklingWater("no", "no", "transparent", 12));
        bottle2.setWater(new SparklingWater("no", "no", "transparent", 18));
        bottle3.setWater(new SparklingWater("no", "yes", "transparent", 25));

        bottle1.setBubbles();
        bottle2.setBubbles();
        bottle3.setBubbles();

        bottle1.open();
        bottle2.open();
        bottle3.open();

    }
}
