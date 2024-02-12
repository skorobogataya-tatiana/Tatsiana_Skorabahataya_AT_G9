package project.content;

public class SparklingWater extends Water {
    private Bubble[] bubbles;
    private boolean isOpened;

    public SparklingWater(String color, String smell, String transperency, int temperature) {
        super(color, smell, transperency, temperature);
        this.isOpened();
    }

    public void pump(Bubble[] bubblesForBottle) {
        for (int i = 0; i < bubblesForBottle.length; i++) {
            bubblesForBottle[i] = new Bubble("Oxigen");
        }
        this.bubbles = bubblesForBottle;
        System.out.printf("Bubbles are pumped to the water").println();
    }

    public void setOpened() throws InterruptedException {
        System.out.printf("Sparkling water is set to open").println();
        isOpened = true;
        this.degas();

    }

    private void degas() throws InterruptedException {
        if (bubbles[(bubbles.length - 1)] != null) {
            int numbeOfBubblesToCramp = 10 + 5 * this.getTemperature();
            int counter = 0;
            for (int i = 0; i < bubbles.length; i++) {
                Bubble bubble = bubbles[i];
                bubble.cramp();
                if (i != 0 && (i % 300 == 0)) {
                    System.out.println();
                }
                bubbles[i] = null;
                counter++;
                if (counter == numbeOfBubblesToCramp) {
                    Thread.sleep(1000);
                }
            }
            System.out.println();
        } else {
            System.out.println("This bottle is already opened!");
        }
        System.out.printf("This water is degased").println();
    }

    private void isOpened() {
        System.out.printf("Checking the state of the bottle").println();

    }
}
