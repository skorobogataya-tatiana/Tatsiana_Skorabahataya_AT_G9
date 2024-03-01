package homework.day9;

import homework.day8.practice.Sand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SandRunner {
    public static void main(String[] args) {
        List<Sand> mySand = new ArrayList<>();
        mySand.add(new Sand(12, "Речной"));
        mySand.add(new Sand(8, "Речной"));
        mySand.add(new Sand(15, "Карьерный"));
        mySand.add(new Sand(7, "Карьерный"));
        mySand.add(new Sand(11, "Речной"));

        mySand.stream().filter(s -> s.getWeight() > 9 && s.getName().contains("ч"))
                .sorted(Comparator.comparing(Sand::getWeight))
                .map(s -> new Sand(s.getWeight() * 2, s.getName().toUpperCase()))
                .collect(Collectors.toMap(Sand::getWeight, Sand::getName))
                .forEach((weight, name) -> {
                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Tatsiana_Skorabahata\\Desktop\\automation\\JavaCourse\\files\\stream\\sand.txt", true));
                        String sandInfo = name + ":" + weight;
                        writer.write(sandInfo + "\n");
                        writer.close();
                    } catch (IOException e) {
                        System.out.println(e.getMessage() + " " + e.getCause());
                    }
                });
    }
}
