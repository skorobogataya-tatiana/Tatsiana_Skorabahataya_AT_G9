package homework.day9;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {
        Stream<String> elements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");

        elements.map(s -> {
            int index = IntStream.range(0, 6).filter(i -> Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb")
                    .toArray()[i]
                    .equals(s))
                    .findFirst().getAsInt();
            if (index % 2 == 0) {
                return s.replaceAll("e", "a");
            } else {
                return String.valueOf(s.length());
            }
        }).distinct().forEach(System.out::println);
    }
}
