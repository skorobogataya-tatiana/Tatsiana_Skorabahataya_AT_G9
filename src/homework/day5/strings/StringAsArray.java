package homework.day5.strings;

public class StringAsArray {

    public static void showLettersOfString (String string) {
        char letter;
        for(int i = 0; i < string.length(); i++) {
            letter = string.charAt(i);
            if(letter==' ') continue;
            System.out.println(letter);
        }
    }
}
