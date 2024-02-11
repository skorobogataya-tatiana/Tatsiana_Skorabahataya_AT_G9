package project.usage;

import project.content.SparklingWater;
import project.boxing.Bottle;

public class BubblesRunner {
    public static void main(String[] args) {

        Bottle smallBottle = new Bottle(0.05, new SparklingWater("Red", "sweet", "transparent", 0), "Oxigen");
        Bottle middleBottle = new Bottle(0.1, new SparklingWater("Blue", "bitter", "transparent", -1), "Helius");
        Bottle bigBottle = new Bottle(0.2, new SparklingWater("Green", "tasty", "turbid", 1), "Nitrogen");


        System.out.println("Open a small bottle!");
        smallBottle.open();
        smallBottle.open();
        System.out.println();

        System.out.println("Open a middle bottle!");
        middleBottle.open();
        System.out.println();

        System.out.println("Open a big bottle!");
        bigBottle.open();

    }
}
