package homework.day8.collections;

import java.util.ArrayList;
import java.util.List;

public class MyCities {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Minsk");
        cities.add("Moskva");
        cities.add("Berlin");

        for (String city : cities) {
            System.out.println(city);
        }

        System.out.println();

        int lettersNumber = 0;
        for (String city : cities) {
            lettersNumber += city.length();
        }
        System.out.println("Total number of letters in all cities names is: " + lettersNumber);
        System.out.println();

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}
