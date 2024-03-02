package classwork.day10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyComparable {
    public static void main(String[] args) {
        List<String> strings = List.of("This is a string number one",
                "Some test string",
                "Hello my friend, this is me",
                "Some test string");
        strings.stream().sorted().forEach(System.out::println);
        System.out.println();

        strings.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println();

        //direct sorting
        strings.stream().sorted(String::compareTo).forEach(System.out::println);
        System.out.println();

        //reverse sorting
        strings.stream().sorted((s1, s2) -> s2.compareTo(s1)).forEach(System.out::println);
        System.out.println();

        //reverse sorting and remove duplicates
        strings.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
        System.out.println();

        List<Person> people = Arrays.asList(new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        people.stream()
                .sorted((p1, p2) -> {
                    if (p1.getSex() != p2.getSex()) {
                        return p1.getSex().compareTo(p2.getSex());

                    } else {
                        return p1.getAge() - p2.getAge();
                    }
                })
                .peek(p -> System.out.println(p.toString())).collect(Collectors.toList());
    }
}
