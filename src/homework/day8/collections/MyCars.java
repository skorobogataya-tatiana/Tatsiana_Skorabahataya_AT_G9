package homework.day8.collections;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCars {

    public static void main(String[] args) {

        List<String> myCarsList = new ArrayList<>();
        myCarsList.add("Mers");
        myCarsList.add("Audi");
        myCarsList.add("Zhiguli");
        myCarsList.add("Reno");
        myCarsList.add("Zhiguli");
        myCarsList.add("Zhiguli");
        myCarsList.add("Audi");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Tatsiana_Skorabahata\\Desktop\\automation\\JavaCourse\\files\\collectionsTest\\cars.txt"));
            String listOfCarsForFile = "";
            for (String car : myCarsList) {
                listOfCarsForFile += "\"" + car + "\"\n";

            }
            writer.write(listOfCarsForFile);
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage() + "\n" + e.getCause());
        }

        System.out.println();

        Iterator<String> iterator = myCarsList.iterator();
        while (iterator.hasNext()) {
            String car = iterator.next();
            if (car.length() > 4) {
                iterator.remove();
            }
        }

        for (String car : myCarsList) {
            System.out.print(car + " ");
        }

    }
}
