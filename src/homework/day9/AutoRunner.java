package homework.day9;

import java.util.stream.Stream;

public class AutoRunner {
    public static void main(String[] args) {
        Stream<String> cars = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");

        cars.distinct()
                .filter(s -> s.contains("и"))
                .skip(1)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
