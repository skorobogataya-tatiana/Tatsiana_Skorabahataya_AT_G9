package homework.day8.collections;

import homework.day8.practice.Water;

import java.util.Arrays;
import java.util.List;

public class MyWater {

    public static void main(String[] args) {

        List<Water> water = Arrays.asList(new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"));

        for (Water sample : water) {
            System.out.println(sample.getColor() + '-' + sample.getSmell());
        }
    }
}
