package project.boxing;

import project.content.Bubble;
import project.content.SparklingWater;
import project.content.Transformable;
import project.content.Water;
import project.matter.Material;

public class Bottle extends Vessel implements Containable{
    private double volume;
    private Water water = new SparklingWater("no", "no", "transparent", 2);

    public Bottle(double volume, double diameter, Material material) {
        super(volume, diameter, material);
        this.volume = volume;
    }

    public double getVolume() {
        System.out.printf("Getting volume of the bottle").println();

        return volume;
    }

    public void warm(int temperature) {
        System.out.printf("Setting of the water temperature to %d degrees", temperature).println();
        this.water.setTemperature(temperature);
    }

    public Water getWater() {
        System.out.printf("Getting water for the bottle").println();
        return water;
    }

    public void setWater(Water water) {

        this.water = water;
        System.out.printf("Setting water to the bottle").println();
    }

    public void setBubbles() {

        Bubble[] bubblesForBottle = new Bubble[(int) (volume * 10000)];
        ((SparklingWater) water).pump(bubblesForBottle);
        System.out.printf("Bubbles where added to the water of the bottle").println();
    }

    public void open() throws InterruptedException {

        ((SparklingWater) water).setOpened();
        System.out.printf("Bottle is opened").println();

    }


    @Override
    public void addStuff(Transformable stuff) {

        System.out.printf("This vessel is %s and %s was added to it.", getClass().getSimpleName(), stuff.getClass().getSimpleName()).println();
    }

    @Override
    public Transformable removeStuff() {
        System.out.printf("Stuff was removed from %s.", getClass().getSimpleName());
        return null;
    }

    @Override
    public boolean isEmpty() {
        boolean checkEmpty = false;
        System.out.printf("This %s is %b", getClass().getSimpleName(), checkEmpty).println();
        return checkEmpty;
    }
}
