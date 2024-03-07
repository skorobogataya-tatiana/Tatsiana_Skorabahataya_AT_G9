package classwork.day11;

import classwork.day10.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepeatClass {
    public static void main(String[] args) {

        Stream<String> words = Stream.of("test", "stream", "hello", "motions", "father", "brother");
        int sum = words.map(String::length).collect(Collectors.summingInt(s -> s % 2 == 0 ? 0 : s));
        System.out.println(sum);

        Stream<String> words2 = Stream.of("test", "stream", "hello", "motions", "father", "brother");
        int sum2 = words2.map(String::length).mapToInt(s -> s % 2 == 0 ? 0 : s).sum();
        System.out.println(sum2);

        Stream<String> words3 = Stream.of("test", "stream", "hello", "motions", "father", "brother");
        System.out.println(words3.collect(Collectors.joining("-", "\"", "\"")));

        Stream<Integer> nums = Stream.of(5, 28, 14, 9, 1, 33);
        IntSummaryStatistics stats = nums.collect(Collectors.summarizingInt(n -> n));
        System.out.println("Max:" + stats.getMax());
        System.out.println("Average:" + stats.getAverage());
        System.out.println("Min:" + stats.getMin());
        System.out.println("Count:" + stats.getCount());
        System.out.println("Sum:" + stats.getSum());

        List<classwork.day10.Person> people = Arrays.asList(new classwork.day10.Person("Вася", 13, classwork.day10.Person.Sex.MAN),
                new classwork.day10.Person("Катя", 28, classwork.day10.Person.Sex.WOMEN),
                new classwork.day10.Person("Вова", 24, classwork.day10.Person.Sex.MAN),
                new classwork.day10.Person("Маша", 38, classwork.day10.Person.Sex.WOMEN),
                new classwork.day10.Person("Роман Петрович", 72, Person.Sex.MAN));

        people.stream().collect(Collectors.toMap(p -> p.hashCode(), p -> p)).keySet().forEach(System.out::println);
                //.forEach((key, value) -> System.out.println(key + ":" + value));

        List<classwork.day10.Person> people2 = Arrays.asList(new classwork.day10.Person("Вася", 13, classwork.day10.Person.Sex.MAN),
                new classwork.day10.Person("Катя", 28, classwork.day10.Person.Sex.WOMEN),
                new classwork.day10.Person("Вова", 24, classwork.day10.Person.Sex.MAN),
                new classwork.day10.Person("Маша", 38, classwork.day10.Person.Sex.WOMEN),
                new classwork.day10.Person("Роман Петрович", 72, Person.Sex.MAN));

        people2.stream().collect(Collectors.groupingBy(p -> p.sex)).forEach((key, value) -> System.out.println(key + ":" + value));

    }
}
