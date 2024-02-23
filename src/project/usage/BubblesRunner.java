package project.usage;

import project.content.SparklingWater;
import project.boxing.Bottle;
import project.matter.Glass;

public class BubblesRunner {
    public static void main(String[] args) throws InterruptedException {

        Bottle smallBottle = new Bottle(0.05, 0.2, new Glass());
        Bottle middleBottle = new Bottle(0.1, 0.2, new Glass());
        Bottle bigBottle = new Bottle(0.2, 0.1, new Glass());


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
