package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Flyable;

public class Fly extends Insect implements Flyable {
    public Fly(int mass, String name) {

        super(mass, name);
    }

    @Override
    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I am flying to %s", getClass().getSimpleName(), getName(), direction).println();
    }
}
