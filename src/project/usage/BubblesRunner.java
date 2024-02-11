package project.usage;

import project.content.SparklingWater;
import project.boxing.Bottle;

public class BubblesRunner {
    public static void main(String[] args) throws InterruptedException {

        Bottle smallBottle = new Bottle(0.05);
        Bottle middleBottle = new Bottle(0.1);
        Bottle bigBottle = new Bottle(0.2);


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
