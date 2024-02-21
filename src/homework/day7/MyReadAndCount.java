package homework.day7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyReadAndCount {

    public void readFileAndCountChars() {
        int numberOfChars = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("consonantsTest.txt"));
            String line;


            while ((line = reader.readLine()) != null) {

                numberOfChars += line.length();

            }
            reader.close();
        } catch (FileNotFoundException e) {

            System.out.println(e);

        } catch (IOException ioEx) {

            System.out.println(ioEx);

        }

        System.out.printf("I've just read the file with %d characters", numberOfChars).println();
    }

    public static void main(String[] args) {

        MyReadAndCount readAndCount = new MyReadAndCount();
        readAndCount.readFileAndCountChars();
    }
}
