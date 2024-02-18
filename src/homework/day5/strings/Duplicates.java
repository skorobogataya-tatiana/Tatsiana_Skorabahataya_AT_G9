package homework.day5.strings;

public class Duplicates {

    public static void showDuplicates(String string) {

        String[] resultOfSplit = string.split("[^a-zA-Z]+");
        String[] duplicates = new String[resultOfSplit.length];
        int duplicateIndex = 0;

        for (int i = 0; i < resultOfSplit.length; i++) {

            String wordToSearchDuplicates = resultOfSplit[i];

            for (int j = i + 1; j < resultOfSplit.length; j++) {

                if (wordToSearchDuplicates.equalsIgnoreCase(resultOfSplit[j])) {
                    boolean isUnique = true;
                    for (int h = 0; h < duplicateIndex; h++) {
                        if (wordToSearchDuplicates.equalsIgnoreCase(duplicates[h])) {
                            isUnique = false;
                            break;
                        }
                    }
                    if (isUnique) {
                        duplicates[duplicateIndex] = wordToSearchDuplicates;
                        duplicateIndex++;
                    }
                }
            }
        }

        for (String w : duplicates) {

            for (String s : resultOfSplit) {
                if (w != null && w.equalsIgnoreCase(s)) {
                    System.out.println(w);
                }
            }
        }
    }
}
