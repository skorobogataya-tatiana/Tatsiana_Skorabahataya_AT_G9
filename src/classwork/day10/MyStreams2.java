package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class MyStreams2 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        System.out.println(people.stream()
                .filter(p -> p.getAge() > 18)
                .filter(p -> ((p.getSex() == Person.Sex.WOMEN && p.getAge() < 55)) || ((p.getSex() == Person.Sex.MAN && p.getAge() < 60)))
                .count());
    }
}
