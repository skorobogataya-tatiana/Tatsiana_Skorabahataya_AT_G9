package homework.day5.playground.essence.craft.hand;

import homework.day5.playground.essence.material.Pourable;

public class Can extends Container implements Storable {
    public Can(int mass, String name) {

        super(mass, name);
    }

    @Override
    public void store(Pourable pourable, int amount) {
        pourable.spread(getName());
        System.out.printf("I am %s, my name is %s and I received %d of %s", getClass().getSimpleName(), getName(), amount, pourable.getClass().getSimpleName()).println();
        if (amount > getMass()) {
            System.out.println("waah-waah-waah-hh..");
        }

    }
}
