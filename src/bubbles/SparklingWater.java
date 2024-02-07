package bubbles;


public class SparklingWater extends Water{
    //Bubble[] bubbles;
    private final int BUBBLES_IN_LITER = 10000;
    public SparklingWater(String color, String smell, double transperency, double temperature) {
        super(color, smell, transperency, temperature);
    }

    public Bubble[] pump(Bottle bottle, String compound) {
        int bubblesNumber = (int) (bottle.getVolume() * BUBBLES_IN_LITER);
        Bubble[] bubbledBottle = new Bubble[bubblesNumber];
        for( int i = 0; i< bubbledBottle.length; i++ ) {
            Bubble bubble = new Bubble(compound);
            bubbledBottle[i] = bubble;
        }
        return bubbledBottle;
    }

    public void degas(Bubble[] bubbledBottle) {
        for(int i = 0; i<bubbledBottle.length; i++) {
            Bubble bubble = bubbledBottle[i];
            bubble.burstBubble();
            if(i!=0&&(i%300==0)) {
                System.out.println();
            }
        }
    }
}
