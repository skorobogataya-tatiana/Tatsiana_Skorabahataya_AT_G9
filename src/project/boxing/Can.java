package project.boxing;

import project.matter.Glass;
import project.matter.Material;
import project.matter.Metal;

public class Can extends Vessel implements Containable {

    public Can(double volume, double diameter, Material material) {
        super(volume, diameter, material);
    }


}
