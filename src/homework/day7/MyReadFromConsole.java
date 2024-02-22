package homework.day7;

import java.util.Scanner;

public class MyReadFromConsole {

    public void showInputMessage() {

        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        System.out.printf("Hello, I just got '%s' from you!", message);

    }

    public static void main(String[] args) {

       MyReadFromConsole test = new MyReadFromConsole();
       test.showInputMessage();

    }
}
