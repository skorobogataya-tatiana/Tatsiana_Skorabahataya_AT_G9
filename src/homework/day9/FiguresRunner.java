package homework.day9;

import java.util.stream.Stream;

public class FiguresRunner {
    public static void main(String[] args) {
        Stream<String> figures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        figures.mapToInt(String::length).filter(i -> i > 4).mapToObj(String::valueOf).forEachOrdered(System.out::println);
    }
}
