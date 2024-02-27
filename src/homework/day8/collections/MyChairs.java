package homework.day8.collections;

import homework.day8.practice.Chair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyChairs {

    public static void main(String[] args) {

        List<Chair> furniture = Arrays.asList(new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4));

        for (Chair someChair : furniture) {
            int heightMyltiplyPerWidth = someChair.getWidth() * someChair.getHeight();
            System.out.print(heightMyltiplyPerWidth + " ");
        }
        System.out.println();

        Map<Integer, Chair> myChairMap = new HashMap<>();
        for (int i = 0; i < furniture.size(); i++) {
            myChairMap.put(i, furniture.get(i));
        }

        System.out.print("The keys of the chair map: ");
        for (int key : myChairMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println("\n");

        System.out.println("The values of the chair map: ");
        for (Chair value : myChairMap.values()) {
            System.out.println(value);
        }
        System.out.println();

        System.out.println("The keys and values of the chair map: ");
        for (Map.Entry<Integer, Chair> pair : myChairMap.entrySet()) {
            System.out.println(pair);
        }

    }
}
