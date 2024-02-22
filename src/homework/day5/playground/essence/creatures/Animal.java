package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Matter;

import java.io.Serializable;

public abstract class Animal extends Matter implements Serializable {

    protected String name;

    public Animal(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Plant food) {
        System.out.printf("I am an %s and I am eating %s ", getName(), food.getName()).println();
    }
}
