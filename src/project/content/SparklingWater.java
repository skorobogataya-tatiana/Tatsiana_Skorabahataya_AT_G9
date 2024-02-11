package project.content;

public class SparklingWater extends Water {
    private Bubble[] bubbles;
    boolean isOpened;
    private final int BUBBLES_IN_LITER = 10000;

    public SparklingWater(String color, String smell, String transperency, int temperature) {
        super(color, smell, transperency, temperature);
        this.isOpened();
    }

   // public void pump(Bottle bottle, String compound) {
     //   int bubblesNumber = (int) (bottle.getVolume() * BUBBLES_IN_LITER);
       // this.bubbles = new Bubble[bubblesNumber];
        //for (int i = 0; i < bubbles.length; i++) {
          //  Bubble bubble = new Bubble(compound);
            //bubbles[i] = bubble;
        //}
    //}

    public void pump(Bubble[] bubblesForBottle) {
        for(int i = 0; i < bubblesForBottle.length; i++) {
            bubblesForBottle[i] = new Bubble("Oxigen");
        }
        this.bubbles = bubblesForBottle;
    }

    public void setOpened() throws InterruptedException {
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
                if(counter==numbeOfBubblesToCramp) {
                    Thread.sleep(1000);
                }
            }
            System.out.println();
        } else {
            System.out.println("This bottle is already opened!");
        }
    }

    private void isOpened() {

    }
}
