package homework.day8.collections;

import java.util.Arrays;
import java.util.List;

public class MyDoubles {

    public static void main(String[] args) {

        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (double num : doubles) {
            System.out.print(num + " ");
        }
        System.out.println();

        double result = 1;
        for (double num : doubles) {
            result *= num;
        }
        System.out.println("The multiplication result of all numbers from the array list is: " + result);

        double sumOfFractions = 0.0;
        for (double num : doubles) {
            double fraction = num - Math.floor(num);
            sumOfFractions += fraction;
        }
        System.out.println("Sum of fractions of all numbers in the array list is: " + sumOfFractions);

        for (double num : doubles) {
            System.out.print((int) num + " ");
        }
    }
}
