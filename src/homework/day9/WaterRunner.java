package homework.day9;

import homework.day8.practice.Water;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {
    public static void main(String[] args) {
        Stream<Water> water = Stream.of(new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"),
                new Water("Синяя", "Мятный"));

        System.out.println(water.filter(w -> !w.getColor().equals("Прозрачная"))
                .sorted(Comparator.comparing(Water::getSmell).reversed())
                .map(w -> {
                    String smell = w.getSmell();
                    if (smell.contains("ы")) {
                        smell = smell.replace("ы", "ыы");
                    }
                    return new Water(w.getColor(), smell);
                })
                .map(Water::getSmell)
                .collect(Collectors.joining())
                .length());
    }
}
