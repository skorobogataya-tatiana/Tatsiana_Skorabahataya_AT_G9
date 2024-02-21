package homework.day7;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyWriteMessageToFile {

    public void writeMessageToFile() {

        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("myMessageFromConsole.txt"));
            out.write(message);
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

        MyWriteMessageToFile writeTest = new MyWriteMessageToFile();
        writeTest.writeMessageToFile();
    }
}
