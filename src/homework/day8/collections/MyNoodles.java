package homework.day8.collections;

import java.util.ArrayList;
import java.util.List;

public class MyNoodles {

    public static void main(String[] args) {

        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String pasta : noodles) {
            if (noodles.indexOf(pasta) != noodles.size() - 1) {
                System.out.print(pasta + '-');
            } else {
                System.out.print(pasta);
            }
        }
        System.out.println();

        for (int i = 0; i < noodles.size(); i++) {
            String newName = noodles.get(i).replace('a', 'o');
            noodles.set(i, newName);
        }

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
    }
}
