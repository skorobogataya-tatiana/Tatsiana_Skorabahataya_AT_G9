package bubbles;

public class BubblesRunner {
    public static void main(String[] args) {

        Bottle smallBottle = new Bottle(0.05, new SparklingWater("Red", "sweet", 0.5, 0.5), "Oxigen");
        Bottle middleBottle = new Bottle(0.1, new SparklingWater("Blue", "bitter", 0.7, 0.7), "Helius");
        Bottle bigBottle = new Bottle(0.2, new SparklingWater("Green", "tasty", 0.3, 0.1), "Nitrogen");


        System.out.println("Open a small bottle!");
        smallBottle.open();
        System.out.println();

        System.out.println("Open a middle bottle!");
        middleBottle.open();
        System.out.println();

        System.out.println("Open a big bottle!");
        bigBottle.open();

    }
}
