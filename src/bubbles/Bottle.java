package bubbles;

public class Bottle {
    private double volume;
    Water water;

    public Bottle(double volume, SparklingWater water) {
        this.volume = volume;
        this.water = water;
    }

    public double getVolume() {
        return volume;
    }

    public Water getWater() {
        return water;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public void open(SparklingWater sparklingwater, Bubble[] bubbledBottle) {
        sparklingwater.degas(bubbledBottle);
    }

}
