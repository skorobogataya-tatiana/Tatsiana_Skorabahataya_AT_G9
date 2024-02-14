package homework.day5.playground.essence.creatures;

public class Beetle extends Insect {
    public Beetle(int mass, String name) {

        super(mass, name);
    }

    public void nest(Carrot home) {
        if (mass > home.getMass()) {
            System.out.printf("I am %s and I will nest here with my %d family members", name, (int) (home.getMass() / getMass())).println();
        } else {
            System.out.println("This carrot is too small for nesting");
        }
    }
}
