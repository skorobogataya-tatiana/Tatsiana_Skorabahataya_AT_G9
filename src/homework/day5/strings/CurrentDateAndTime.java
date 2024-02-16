package homework.day5.strings;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateAndTime {

    public static void showCurrentDateAndTime() {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatterDay = DateTimeFormatter.ofPattern("d MMMM, yyyy");
        DateTimeFormatter formatterHours = DateTimeFormatter.ofPattern("H");
        DateTimeFormatter formatterMinutes = DateTimeFormatter.ofPattern("m");
        String formattedDate = formatterDay.format(now);
        String formattedHour = formatterHours.format(now);
        String formattedMinutes = formatterMinutes.format(now);

        System.out.println("Today is " + formattedDate + ", " + formattedHour + " hours " + formattedMinutes + " minutes.");

    }
}
