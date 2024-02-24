package homework.day8.collections;

import java.util.ArrayList;
import java.util.List;

public class MyElements {

    public static int countNumberOfWordsInName(String name) {
        String[] words = name.split(" ");
        return words.length;
    }

    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();

        int numberOfNames = 0;
        for (String element : elements) {
            if (countNumberOfWordsInName(element) > 1) {
                numberOfNames++;
            }
        }
        System.out.println("Number of elements that have more than one word in the name: " + numberOfNames);

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println();

        elements.add(3, "Spinner");
        elements.remove(1);
        elements.set(4, "Switch");

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
    }
}
