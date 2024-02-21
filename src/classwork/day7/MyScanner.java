package classwork.day7;

import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();

            if (incoming.equalsIgnoreCase("Tania")) {
                System.out.println("The end!");
                break;
            }
            System.out.printf("I've just got %s text", incoming).println();
        }
    }
}
