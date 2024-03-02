package homework.day9;

import java.util.Comparator;
import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
        Stream<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);
        numbersMod.filter(i -> i.toString().contains("3"))
                .flatMapToInt(i -> String.valueOf(i).chars())
                .mapToObj(c -> (char) c)
                .map(c -> {
                    switch (c) {
                        case '0':
                            return "Zero";
                        case '1':
                            return "One";
                        case '2':
                            return "Two";
                        case '3':
                            return "Three";
                        case '4':
                            return "Four";
                        case '5':
                            return "Five";
                        case '6':
                            return "Six";
                        case '7':
                            return "Seven";
                        case '8':
                            return "Eight";
                        case '9':
                            return "Nine";
                        default:
                            return "";
                    }
                })
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
