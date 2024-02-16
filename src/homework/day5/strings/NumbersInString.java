package homework.day5.strings;

public class NumbersInString {

    public static void showNumbersFromString(String string) {
        String newString = string.replaceAll("[^\\d]", "");
        int[] numbersFromString = new int[newString.length()];
        for(int i =0; i < newString.length(); i++) {
            String number = String.valueOf(newString.charAt(i));
            numbersFromString[i] = Integer.parseInt(number);
            System.out.println(numbersFromString[i]);
        }
        System.out.println();
    }
}
