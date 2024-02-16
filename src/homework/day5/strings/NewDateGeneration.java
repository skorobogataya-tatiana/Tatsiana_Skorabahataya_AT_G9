package homework.day5.strings;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NewDateGeneration {

    public static void showNewDate(String stringWithVowels) {

        int daysToAdd = 0;
        String vowels = "aAeEiIoOuUyY";

        for(int i = 0; i < stringWithVowels.length(); i++) {
            char ch = stringWithVowels.charAt(i);
            if(vowels.indexOf(ch) >= 0 && vowels.indexOf(ch) < vowels.length()) {
                daysToAdd++;
            }
        }

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime generated = now.plusDays(daysToAdd);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM");
        String formattedDate = generated.format(formatter);
        System.out.println("The generated vowel date is: " + formattedDate);
    }
}
