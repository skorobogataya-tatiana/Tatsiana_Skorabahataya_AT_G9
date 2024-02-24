package classwork.day8;

import java.util.HashMap;
import java.util.Map;

public class MyMapTest {

    public static void main(String[] args) {

        Map<Integer, String> myMap = new HashMap<>();
        String[] words = "мама мыла раму мыла".split(" ");

        for (int i = 0; i < words.length; i++) {

            myMap.put(i, words[i]);
        }

        for (int key : myMap.keySet()) {
            System.out.print(key + " ");

        }
        System.out.println();

        for (String value : myMap.values()) {
            System.out.print(value + " ");

        }
        System.out.println();

        for (Map.Entry<Integer, String> pair : myMap.entrySet()) {
            System.out.println(pair);
        }
    }
}
