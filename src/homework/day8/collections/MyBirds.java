package homework.day8.collections;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyBirds {

    public static int countNumberOfVowels(String word) {

        int counter = 0;
        Pattern pattern = Pattern.compile("[аеёиоуыэюя]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(word);
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {

        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }

        int numberOfBirdsWithSeveralVowels = 0;
        for (String bird : birds) {
            if (countNumberOfVowels(bird) > 1) {
                numberOfBirdsWithSeveralVowels++;
            }
        }
        System.out.println("Number of birds, whose names contain more than 1 vowel, is: " + numberOfBirdsWithSeveralVowels);

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
        System.out.println();

        birds.set(2, "Синица");

        for (String bird : birds) {
            System.out.print(bird + " ");
        }
    }

}
