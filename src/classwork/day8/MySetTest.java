package classwork.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySetTest {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        String[] words = "мама мыла раму мыла".split(" ");
        for (String word : words) {
            mySet.add(word);
        }

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        for (String str : mySet) {
            System.out.print(str + " ");
        }
    }
}
