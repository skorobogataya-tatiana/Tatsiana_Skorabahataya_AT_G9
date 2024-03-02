package homework.day9;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirdsRunner {
    public static void main(String[] args) {
        Collection<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        Stream<String> birdsStream = birds.stream();

        Arrays.stream(birdsStream.map(s -> s.replaceAll("о", "а"))
                        .map(String::toLowerCase)
                        .collect(Collectors.joining())
                        .replaceAll("ь", "").split("б"))
                .forEach(s -> System.out.println("--" + s + "--"));
    }
}
