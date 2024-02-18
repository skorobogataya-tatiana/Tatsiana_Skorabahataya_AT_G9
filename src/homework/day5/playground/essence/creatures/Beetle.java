package homework.day5.playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {
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


    @Override
    public void crawl(String direction, int distance) {
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units", getClass().getSimpleName(), getName(), direction, distance).println();
        System.out.println("vz-vz-vzz-zz..");
    }
}
