package project.boxing;

import project.content.Bubble;
import project.content.SparklingWater;
import project.content.Water;

public class Bottle {
    private double volume;
    private Water water = new SparklingWater("no", "no", "transparent", 2);

    public Bottle(double volume) {
        this.volume = volume;
    }

    public double getVolume() {

        return volume;
    }

    public void warm(int temperature) {
        this.water.setTemperature(temperature);
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public void setBubbles() {
        Bubble[] bubblesForBottle = new Bubble[(int) (volume * 10000)];
        ((SparklingWater) water).pump(bubblesForBottle);
    }

    public void open() throws InterruptedException {

        ((SparklingWater) water).setOpened();

    }

}
