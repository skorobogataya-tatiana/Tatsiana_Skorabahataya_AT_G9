package homework.day8.collections;

import java.util.ArrayList;
import java.util.List;

public class MyCountries {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("Andora");
        countries.add("Portugal");
        countries.add("England");
        countries.add("Zambia");

        for (String country : countries) {
            if (countries.indexOf(country) != countries.size() - 1) {
                System.out.print(country + ", ");
            } else {
                System.out.print(country);
            }
        }

        System.out.println();
        int counter = 0;
        for (String country : countries) {
            if (country.length() < 7) {
                counter++;
            }
        }
        System.out.println("Number of countries, which names contain less than 7 letters: " + counter);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
