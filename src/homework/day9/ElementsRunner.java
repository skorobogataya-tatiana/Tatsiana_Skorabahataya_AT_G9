package homework.day9;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {
        Stream<String> elements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");

        //Version for considering each element of the stream as one name
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
        System.out.println();

        //Version when we need to iterate through each word of each element of the stream
        Stream<String> elements2 = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");
        elements2.map(s -> {
                    String[] nameWords = s.split("[\\s-]");
                    String newName = "";
                    for (int i = 0; i < nameWords.length; i++) {
                        if (i % 2 == 0) {
                            newName += nameWords[i].replaceAll("e",  "a") + " ";;
                        } else {
                            newName += nameWords[i].length() + " ";
                        }
                    }
                    return newName.trim();
                }
        ).distinct().forEach(System.out::println);
    }
}
