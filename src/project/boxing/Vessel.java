package project.boxing;

import project.content.Transformable;
import project.matter.Material;

public abstract class Vessel {

private double volume;
private double diameter;
private int weight;

private Material material;
protected Transformable stuff;

    public Vessel(double volume, double diameter, Material material) {

        this.volume = volume;
        this.diameter = diameter;
        this.material = material;
        weight = (int) Math.round(volume * material.getDensity() / diameter);
    }

    public double getVolume() {
        return volume;
    }

    public double getDiameter() {
        return diameter;
    }

    public int getWeight() {
        return weight;
    }

    public Material getMaterial() {
        return material;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
