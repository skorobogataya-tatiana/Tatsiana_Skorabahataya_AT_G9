package homework.day9;

import homework.day8.practice.Bubble;
import homework.day8.practice.Chair;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.stream.Stream;

public class FurnitureRunner {
    public static void main(String[] args) {
        Stream<Chair> furniture = Stream.of(new Chair(120, 40), new Chair(90, 30), new Chair(100, 50), new Chair(110, 45));

        furniture.filter(chair -> chair.getHeight() >= 100 && chair.getWidth() <= 50).sorted((chair1, chair2) -> {
            if (chair1.getHeight() != chair2.getHeight()) {
                return chair2.getHeight() - chair1.getHeight();
            } else {
                return chair2.getWidth() - chair1.getWidth();
            }
        }).map(chair -> new Chair(chair.getHeight() / 2, chair.getWidth() * new Random().nextInt(3, 9)))
                .mapToInt(chair -> chair.getWidth() * chair.getHeight())
                .distinct()
                .max().stream().mapToObj(number -> {

            String bubbleName = "";
            char[] nameNumbers = String.valueOf(number).toCharArray();
            for (char ch : nameNumbers) {

                switch (ch) {
                    case '0':
                        bubbleName += "Zero" + " ";
                        break;
                    case '1':
                        bubbleName += "One" + " ";
                        break;
                    case '2':
                        bubbleName += "Two" + " ";
                        break;
                    case '3':
                        bubbleName += "Three" + " ";
                        break;
                    case '4':
                        bubbleName += "Four" + " ";
                        break;
                    case '5':
                        bubbleName += "Five" + " ";
                        break;
                    case '6':
                        bubbleName += "Six" + " ";
                        break;
                    case '7':
                        bubbleName += "Seven" + " ";
                        break;
                    case '8':
                        bubbleName += "Eight" + " ";
                        break;
                    case '9':
                        bubbleName += "Nine" + " ";
                        break;
                }
            }
            return new Bubble(number, bubbleName.trim());
        }).forEach(bubble -> {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Tatsiana_Skorabahata\\Desktop\\automation\\JavaCourse\\files\\stream\\bubble.txt"))) {

                String bubbleInfo = bubble.toString();
                writer.write(bubbleInfo);
            } catch (IOException e) {
                System.out.println(e.getMessage() + " " + e.getCause());
            }
        });
    }
}
