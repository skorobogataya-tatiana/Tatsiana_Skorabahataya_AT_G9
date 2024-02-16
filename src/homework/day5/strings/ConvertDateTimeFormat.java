package homework.day5.strings;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertDateTimeFormat {


    public static void showConvertedDateTime(String dateTime) {

        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("H.m dd.MM.yyyy");
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("MMMM, d, yyyy HH:mm");

        LocalDateTime parsedInputDateTime = LocalDateTime.parse(dateTime, inputFormat);
        String formattedDate = parsedInputDateTime.format(outputFormat);
        System.out.println(formattedDate);
        System.out.println();
    }
}
