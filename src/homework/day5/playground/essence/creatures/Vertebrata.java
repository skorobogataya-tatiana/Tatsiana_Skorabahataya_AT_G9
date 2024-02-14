package homework.day5.playground.essence.creatures;

public abstract class Vertebrata extends Animal {
    public Vertebrata(int mass, String name) {
        super(mass, name);
    }

    public void eat(Insect food) {
        System.out.printf("I am an %s and I am eating %s ", getName(), food.getName()).println();
    }
}
