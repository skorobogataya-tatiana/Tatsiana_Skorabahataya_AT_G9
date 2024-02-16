package homework.day5.strings;

public class Duplicates {

    public static void showDuplicates(String string) {
        String[] resultOfSplit = string.split(" ");
        String newStringWithDuplicates = "";
        for (int i = 0; i < resultOfSplit.length; i++) {

            String wordToSearchDuplicates = resultOfSplit[i];
            int counter = 0;
            for (int j = i + 1; j < resultOfSplit.length; j++) {

                if (wordToSearchDuplicates.equalsIgnoreCase(resultOfSplit[j])) {
                    counter++;
                    if (!newStringWithDuplicates.contains(wordToSearchDuplicates)) {
                        newStringWithDuplicates = newStringWithDuplicates + " " + wordToSearchDuplicates;
                    }
                }
            }
        }

        String[] words = newStringWithDuplicates.split(" ");
        for (int w = 0; w < words.length; w++) {

            String duplicate = words[w];
            for (int s = 0; s < resultOfSplit.length; s++) {
                if (duplicate.equalsIgnoreCase(resultOfSplit[s])) {
                    System.out.println(duplicate);
                }
            }

        }
    }
    }
