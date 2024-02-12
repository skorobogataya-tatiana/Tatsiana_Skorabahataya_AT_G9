package project.content;

public class Bubble {
    private final double VOLUME = 0.3;
    private String gas;

    public Bubble(String gas) {

        this.gas = gas;
    }

    public double getVolume() {
        System.out.printf("Getting volume of the bubble").println();
        return VOLUME;
    }

    public void cramp() {

        System.out.print("Cramp!");
    }
}
