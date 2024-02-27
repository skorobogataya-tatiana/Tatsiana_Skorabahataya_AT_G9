package homework.day8.collections;

import homework.day8.practice.Sand;

import java.util.*;

public class MySand {

    public static void main(String[] args) {

        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        for (Sand sample : sandbox) {
            System.out.print(sample.getWeight() + " ");
        }
        System.out.println();

        for (Sand sample : sandbox) {
            System.out.print(sample.getName() + " ");
        }
        System.out.println();

        Map<Integer, Sand> mySandMap = new HashMap<>();

        for (int i = 0; i < sandbox.size(); i++) {
            mySandMap.put(i, sandbox.get(i));
        }

        System.out.print("The keys of the sand map: ");
        for (int key : mySandMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println("\n");

        System.out.println("The values of the sand map: ");
        for (Sand sample : mySandMap.values()) {
            System.out.println(sample + " ");
        }
        System.out.println();

        System.out.println("The keys and values of the sand map: ");
        for (Map.Entry<Integer, Sand> pair : mySandMap.entrySet()) {
            System.out.println(pair);
        }
    }
}
