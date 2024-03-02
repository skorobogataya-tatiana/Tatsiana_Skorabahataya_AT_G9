package homework.day9;

import homework.day8.practice.Bubble;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class DoublesRunner {
    public static void main(String[] args) {
        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
        System.out.println(doubles.map(b -> (int) Math.round(b)).
                map(b -> {
                    Random random = new Random();
                    return random.nextInt(0, b + 1);
                })
                .distinct()
                .map(b -> {
                    Bubble[] bubbles = new Bubble[b];
                    for (int i = 0; i < bubbles.length; i++) {
                        bubbles[i] = new Bubble(b, "Bubble vol -" + b);
                    }
                    return bubbles;
                })
                .peek(b -> System.out.println(Arrays.toString(b)))
                .flatMap(Arrays::stream)
                .mapToInt(Bubble::getVolume)
                .sum());
    }
}
