package homework.day8.collections;

import homework.day8.practice.Person;

import java.util.ArrayList;
import java.util.List;

public class MyPeople {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person(32, "Kolia"));
        people.add(new Person(24, "Olia"));
        people.add(new Person(55, "Vasia"));
        people.add(new Person(63, "Masha"));

        for (Person person : people) {
            System.out.print(person.getAge() + " ");
        }
        System.out.println();

        for (Person person : people) {
            System.out.print(person.getName() + " ");
        }
        System.out.println();

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }
}
