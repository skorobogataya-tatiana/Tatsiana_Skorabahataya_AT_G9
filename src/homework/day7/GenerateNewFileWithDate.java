package homework.day7;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GenerateNewFileWithDate {

    public void createFileWithDate() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Tatsiana_Skorabahata\\Desktop\\automation\\JavaCourse\\files\\testFileThree.txt"));
            String line;
            int numberOfCharacters = 0;

            while((line = reader.readLine()) != null) {
                numberOfCharacters += line.length();
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Tatsiana_Skorabahata\\Desktop\\automation\\JavaCourse\\files\\" + generateFileName(numberOfCharacters)));
            writer.write(" Number of characters in the file is: " + numberOfCharacters);
            writer.close();

        } catch(FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException i) {
            System.out.println(i);
        }
    }

    private String generateFileName(int number) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        String dateTime = now.format(formatter);

        return dateTime + "_" + number;
    }

    public static void main(String[] args) {

        GenerateNewFileWithDate fileWithDate = new GenerateNewFileWithDate();
        fileWithDate.createFileWithDate();
        System.out.println("File is generated! Check, please.");
    }
}
