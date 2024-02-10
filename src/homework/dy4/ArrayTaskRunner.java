package homework.dy4;

import java.util.Random;

public class ArrayTaskRunner {
    public static void main(String[] args) {
        ArrayTask arrayTask = new ArrayTask();
        int[] numbers = new int[12];
        Random random = new Random();
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        for (int j : numbers) {
            System.out.print(j + " ");
        }
        System.out.println();
        arrayTask.showSumOfParticularArrayItems(numbers, 4);
        System.out.println();
        int [] newArray = arrayTask.getNewArray(numbers, 3);
        arrayTask.showRevertedArray(newArray);
    }

}
