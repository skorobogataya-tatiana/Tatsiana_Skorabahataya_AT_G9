package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class MyCollectionTest {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        String[] words = "мама мыла раму мыла".split(" ");
        for (String string : words) {
            myList.add(string);
        }

        for (int j = 0; j < myList.size(); j++) {
            System.out.print(myList.get(j) + " ");
        }

        System.out.println();
        for (String word : myList) {
            System.out.print(word + " ");
        }
    }
}
