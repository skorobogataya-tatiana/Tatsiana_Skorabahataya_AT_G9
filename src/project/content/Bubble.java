package project.content;

public class Bubble {
    private final double VOLUME = 0.3;
    private String compound;

    public Bubble(String compound) {
        this.compound = compound;
    }

    public void burstBubble() {

        System.out.print("Cramp!");
    }
}
