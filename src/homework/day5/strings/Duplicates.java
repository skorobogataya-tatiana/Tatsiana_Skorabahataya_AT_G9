package homework.day5.strings;

public class Duplicates {

    public static void findDuplicates(String string) {
        String[] resultOfSplit = string.split(" ");
        for (int i = 0; i < resultOfSplit.length; i++) {
            String wordToSearchDuplicates = resultOfSplit[i];
            for (int j = i + 1; j < resultOfSplit.length; j++) {
                int counter = 0;
                if (wordToSearchDuplicates.equalsIgnoreCase(resultOfSplit[j])) {
                    System.out.println(resultOfSplit[i]);
                    counter++;
                    if (counter > 1) continue;
                    System.out.println(resultOfSplit[j]);
                }
            }
        }
    }
}
