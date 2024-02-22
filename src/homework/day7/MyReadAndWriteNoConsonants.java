package homework.day7;

import java.io.*;

public class MyReadAndWriteNoConsonants {

    public void writeMessageWithoutCononants() {

        try {

            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Tatsiana_Skorabahata\\Desktop\\automation\\JavaCourse\\files\\messageTwo.txt"));
            String line;
            String newText = "";

            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "");
                newText += modifiedLine + "\n";
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Tatsiana_Skorabahata\\Desktop\\automation\\JavaCourse\\files\\messageTwo.txt", true));
            writer.write("\n\n" + newText);
            writer.close();

        } catch (FileNotFoundException nf) {

            System.out.println(nf);

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    public static void main(String[] args) {

        MyReadAndWriteNoConsonants consonantsTest = new MyReadAndWriteNoConsonants();
        consonantsTest.writeMessageWithoutCononants();
        System.out.println("Done!");
    }
}
