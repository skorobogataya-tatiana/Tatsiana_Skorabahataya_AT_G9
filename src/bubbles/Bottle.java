package bubbles;

public class Bottle {
    private double volume;
    SparklingWater water;

    public Bottle(double volume, SparklingWater water, String compound) {
        this.volume = volume;
        this.water = water;
        water.pump(this, compound);
    }

    public double getVolume() {
        return volume;
    }

    public void open() {

        water.degas();
    }

}
