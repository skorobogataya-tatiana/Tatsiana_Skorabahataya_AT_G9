package classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStrieamTest {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        long counter = list.stream().filter("мама"::equalsIgnoreCase).count();
        System.out.println("Number of word mama in the list is: " + counter);

        String firstItem = list.stream().findFirst().orElse("мама");
        System.out.println(firstItem);

        String firstMama = list.stream().filter("мама"::equalsIgnoreCase).findFirst().get();
        System.out.println(firstMama);

        String fifthElement = list.stream().skip(4).findFirst().get();
        System.out.println(fifthElement);

        List<String> newCollection = list.stream().skip(2).limit(2).collect(Collectors.toList());
        System.out.println(newCollection);

        List<String> collection2 = list.stream().distinct().filter(s -> s.contains("м")).collect(Collectors.toList());
        System.out.println(collection2);
    }
}
