package homework.day5.playground.essence.creatures;

import java.io.Serializable;

public abstract class Insect extends Animal implements Serializable {
    public Insect(int mass, String name) {

        super(mass, name);
    }
}
