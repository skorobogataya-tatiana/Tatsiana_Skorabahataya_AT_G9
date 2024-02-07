package bubbles;

public class BubblesRunner {
    public static void main(String[] args) {
        SparklingWater waterForBottle1 = new SparklingWater("Red", "sweet", 0.5, 0.5);
        SparklingWater waterForBottle2 = new SparklingWater("Blue", "bitter", 0.7, 0.7);
        SparklingWater waterForBottle3 = new SparklingWater("Green", "tasty", 0.3, 0.1);

        Bottle small = new Bottle(0.05, waterForBottle1);
        Bottle middle = new Bottle(0.1, waterForBottle2);
        Bottle big = new Bottle(0.2, waterForBottle3);


        System.out.println("Open a small bottle!");
        small.open(waterForBottle1, waterForBottle1.pump(small, "Oxigen"));
        System.out.println();
        System.out.println("Open a middle bottle!");
        middle.open(waterForBottle2, waterForBottle2.pump(middle, "Helium"));
        System.out.println();
        System.out.println("Open a big bottle!");
        big.open(waterForBottle3, waterForBottle3.pump(big, "Nitrogen"));


    }
}
