package homework.day5.strings;

public class StringStaticRunner {

    public static void main(String[] args) {

        StringAsArray.showLettersOfString("This is my string!");
        Duplicates.showDuplicates("This duplicates string is a string for checking this string duplicates string !");
        NumbersInString.showNumbersFromString("This is string 1 that contains 234 73 some numbers 09 ");

        ParceLog.checkLog("access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied\n");

        System.out.println();
        CurrentDateAndTime.showCurrentDateAndTime();
        ConvertDateTimeFormat.showConvertedDateTime("22.00 07.09.2020");
        NewDateGeneration.showNewDate("This is a test");
    }
}
