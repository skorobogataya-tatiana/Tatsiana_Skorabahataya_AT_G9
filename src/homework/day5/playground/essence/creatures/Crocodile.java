package homework.day5.playground.essence.creatures;

public class Crocodile extends Vertebrata implements Crawlable {
    public Crocodile(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void crawl(String direction, int distance) {
        System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units", getClass().getSimpleName(), getName(), direction, distance).println();
        System.out.println("wr-wr-wrr-r..");
    }
}
