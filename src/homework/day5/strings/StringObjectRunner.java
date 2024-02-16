package homework.day5.strings;

public class StringObjectRunner {

    public static void main(String[] args) {

        StringAsArray stringAsArray = new StringAsArray();
        stringAsArray.showLettersOfString("This is my string!");
        System.out.println();

        Duplicates duplicates = new Duplicates();
        duplicates.showDuplicates("This string is a string for checking this duplicates!");
        System.out.println();

        NumbersInString numbersInString = new NumbersInString();
        numbersInString.showNumbersFromString("This is string 1 that contains 234 73 some numbers 09 ");
        System.out.println();

        ParceLog parceLog = new ParceLog();
        parceLog.checkLog("access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied\n");


        CurrentDateAndTime currentDateAndTime = new CurrentDateAndTime();
        currentDateAndTime.showCurrentDateAndTime();
        System.out.println();

        ConvertDateTimeFormat convertDateTimeFormat = new ConvertDateTimeFormat();
        convertDateTimeFormat.showConvertedDateTime("22.00 07.09.2020");
        System.out.println();

        NewDateGeneration newDateGeneration = new NewDateGeneration();
        newDateGeneration.showNewDate("This is a test");


    }
}
