package homework.day7;

import java.io.*;

public class MyReadAndWrite {

    public void writeTextWithRemovedVowels() {
        try {

            BufferedReader in = new BufferedReader(new FileReader("myMessageFromConsole.txt"));
            String line;
            String newMessage = "";

            while ((line = in.readLine()) != null) {

                String newLine = line.replaceAll("[aeiouAEIOU]", "");
                newMessage += newLine + "\n";

            }
            in.close();

            BufferedWriter out = new BufferedWriter(new FileWriter("myMessageFromConsole.txt"));
            out.write(newMessage);
            out.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);

        } catch (IOException ex) {
            System.out.println(ex);

        }
    }

    public static void main(String[] args) {

        MyReadAndWrite testRemoveVowels = new MyReadAndWrite();
        testRemoveVowels.writeTextWithRemovedVowels();
        System.out.println("Done!");
    }
}
