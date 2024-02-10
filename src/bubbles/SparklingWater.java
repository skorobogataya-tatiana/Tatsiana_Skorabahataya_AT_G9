package bubbles;

public class SparklingWater extends Water {
    Bubble[] bubbles;
    private final int BUBBLES_IN_LITER = 10000;

    public SparklingWater(String color, String smell, double transperency, double temperature) {
        super(color, smell, transperency, temperature);
    }

    public void pump(Bottle bottle, String compound) {
        int bubblesNumber = (int) (bottle.getVolume() * BUBBLES_IN_LITER);
        this.bubbles = new Bubble[bubblesNumber];
        for (int i = 0; i < bubbles.length; i++) {
            Bubble bubble = new Bubble(compound);
            bubbles[i] = bubble;
        }
    }

    public void degas() {
        if (bubbles[bubbles.length - 1] != null) {
            for (int i = 0; i < bubbles.length; i++) {
                Bubble bubble = bubbles[i];
                bubble.burstBubble();
                if (i != 0 && (i % 300 == 0)) {
                    System.out.println();
                }
                bubbles[i] = null;
            }
        } else {
            System.out.println("This bottle is already opened!");
        }
    }
}
