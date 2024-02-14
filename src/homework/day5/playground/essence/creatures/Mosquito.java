package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Flyable;

public class Mosquito extends Insect implements Flyable {
    public Mosquito(int mass, String name) {

        super(mass, name);
    }

    @Override
    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I am flying to %s", this.getClass().getSimpleName(), this.getName(), direction).println();
    }
}
