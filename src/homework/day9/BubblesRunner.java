package homework.day9;

import homework.day8.practice.Bubble;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class BubblesRunner {
    public static void main(String[] args) {
        Collection<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO"));

        System.out.println(bubbles.stream()
                .filter(b -> b.getVolume() > 3)
                .sorted(Comparator.comparing(Bubble::getName))
                .map(b -> new Bubble(b.getVolume() * 3, b.getName()))
                .mapToInt(Bubble::getVolume)
                .reduce(Integer::sum)
                .getAsInt());
    }
}
