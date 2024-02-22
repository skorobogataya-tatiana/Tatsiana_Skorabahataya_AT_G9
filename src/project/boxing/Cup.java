package project.boxing;

import project.matter.Material;

public class Cup extends Vessel implements Containable {

    public Cup(double volume, double diameter, Material material) {
        super(volume, diameter, material);
    }
}
