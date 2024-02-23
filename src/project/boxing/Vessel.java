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

        System.out.printf("The volume of %s is %f", this.getClass().getSimpleName(), volume).println();
        return volume;
    }

    public double getDiameter() {

        System.out.printf("The diameter of %s is %f", this.getClass().getSimpleName(), diameter).println();
        return diameter;
    }

    public int getWeight() {

        System.out.printf("The weight of %s is %d", this.getClass().getSimpleName(), weight).println();
        return weight;
    }

    public Material getMaterial() {

        System.out.printf("The material of %s is %s", this.getClass().getSimpleName(), material.getClass().getSimpleName()).println();
        return material;
    }

    public void setVolume(double volume) {
        this.volume = volume;
        System.out.printf("The volume of %s is set to %f", this.getClass().getSimpleName(), volume).println();
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
        System.out.printf("The diameter of %s is set to %f", this.getClass().getSimpleName(), diameter).println();
    }

    public void setWeight(int weight) {
        System.out.printf("The weight of %s is set to %d", this.getClass().getSimpleName(), weight).println();
        this.weight = weight;
    }

    public void setMaterial(Material material) {
        System.out.printf("The material of %s is set to %s", this.getClass().getSimpleName(), material.getClass().getSimpleName()).println();
        this.material = material;
    }
}
