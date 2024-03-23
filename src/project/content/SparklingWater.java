package project.content;

import java.util.List;

public class SparklingWater extends Water {
    private List<Bubble> bubbles;
    private volatile boolean isOpened;

    public SparklingWater(String color, String smell, String transperency, int temperature) {
        super(color, smell, transperency, temperature);
        new Thread(() -> this.isOpened()).start();
    }

    public void pump(List<Bubble> bubblesForBottle, int size) {
        for (int i = 0; i < size; i++) {
            bubblesForBottle.add(i, new Bubble("Oxigen"));
        }
        this.bubbles = bubblesForBottle;
        isOpened = false;
        System.out.printf("Bubbles are pumped to the water").println();
    }

    public void setOpened() throws InterruptedException {
        System.out.printf("Sparkling water is set to open").println();
        isOpened = true;
        //degas();
    }

    private void degas() throws InterruptedException {
        if (!bubbles.isEmpty()) {
            int numbeOfBubblesToCramp = 10 + 5 * this.getTemperature();
            int counter = 0;
            for (int i = 0; i < bubbles.size(); i++) {
                Bubble bubble = bubbles.get(i);
                bubble.cramp();
                if (i != 0 && (i % 300 == 0)) {
                    System.out.println();
                }
                bubbles.set(i, null);
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
        while (!isOpened) {
            System.out.printf("Checking the state of the bottle").println();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            degas();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
