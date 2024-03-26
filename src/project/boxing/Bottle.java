package project.boxing;

import project.content.Bubble;
import project.content.SparklingWater;
import project.content.Transformable;
import project.content.Water;
import project.matter.Material;

import java.util.ArrayList;
import java.util.List;

public class Bottle extends Vessel implements Containable {

    private Water water;

    public Bottle(double volume, double diameter, Material material) {
        super(volume, diameter, material);
    }


    public void warm(int temperature) {

        water.setTemperature(temperature);
        System.out.printf("Setting of the water temperature to %d degrees", temperature);
    }

    public Water getWater() {
        System.out.printf("Getting water for the bottle").println();
        return water;
    }

    public void open() {
        try {
            ((SparklingWater) water).setOpened();
            System.out.printf("Bottle of %f volume with %s is opened", getVolume(), water.getClass().getSimpleName()).println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void addStuff(Transformable stuff) {
        if (stuff instanceof SparklingWater) {
            this.water = (SparklingWater) stuff;
            setBubbles();
        }
        System.out.printf("This vessel is %s and %s was added to it.", getClass().getSimpleName(), stuff.getClass().getSimpleName()).println();
    }

    private void setBubbles() {
        List<Bubble> bubblesForBottle = new ArrayList<>();
        int listSize = (int) (getVolume() * 10000);
        //List.of(new Bubble[]);
        ((SparklingWater) water).pump(bubblesForBottle, listSize);
        System.out.printf("Bubbles where added to the water of the bottle").println();
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
