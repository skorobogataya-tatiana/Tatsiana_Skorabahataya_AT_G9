package project.boxing;

import project.content.Transformable;
import project.matter.Glass;
import project.matter.Material;
import project.matter.Metal;

public class Can extends Vessel implements Containable {

    public Can(double volume, double diameter, Material material) {
        super(volume, diameter, material);
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
