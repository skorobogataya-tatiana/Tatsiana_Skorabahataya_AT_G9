package project.usage;

import project.boxing.Bottle;
import project.content.SparklingWater;
import project.matter.Glass;

public class Factory {
    public static void main(String[] args) throws InterruptedException {
        Bottle bottle1 = new Bottle(0.05, 5.0, new Glass());
        Bottle bottle2 = new Bottle(0.1, 6.0, new Glass());
        Bottle bottle3 = new Bottle(0.2, 6.0, new Glass());

        bottle1.addStuff(new SparklingWater("no", "no", "transparent", 12));
        bottle2.addStuff(new SparklingWater("no", "no", "transparent", 18));
        bottle3.addStuff(new SparklingWater("no", "yes", "transparent", 25));

        bottle1.open();
        bottle2.open();
        bottle3.open();

    }
}
