package homework.day8.collections;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MyFigures {

    public static void main(String[] args) {

        List<String> myFiguresList = Arrays.asList("Oval", "Rectangle", "Circle", "Square", "Ellipse");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Tatsiana_Skorabahata\\Desktop\\automation\\JavaCourse\\files\\collectionsTest\\figures.txt"));
            String stringToWrite = "";
            for (String figure : myFiguresList) {

                if (myFiguresList.indexOf(figure) != myFiguresList.size() - 1) {
                    stringToWrite += figure + "-";
                } else {
                    stringToWrite += figure;
                }
            }
            writer.write(stringToWrite);
            writer.close();
        } catch (IOException e) {

            System.out.println(e.getMessage() + "\n" + e.getCause());
        }

        int counterOfMatches = 0;
        for (String figure : myFiguresList) {
            if (!figure.toLowerCase().contains(String.valueOf('a'))) {
                counterOfMatches++;
            }
        }
        System.out.println("Number of figures that don't contain letter 'a' in their name: " + counterOfMatches);

        for (int i = 0; i < myFiguresList.size(); i++) {
            System.out.print(myFiguresList.get(i) + " ");
        }
        System.out.println();

        try {
            myFiguresList.add(2, "Triangle");
        } catch (UnsupportedOperationException e) {
            System.out.println(e);
            System.out.println("Reason of exception: size of Array list, initialised via Arrays.asList(), can't be changed, so add() method with index can't be used here");
        }

        for (String figure : myFiguresList) {
            System.out.print(figure + " ");
        }
    }
}
