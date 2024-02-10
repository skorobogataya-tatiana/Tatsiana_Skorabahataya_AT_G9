package homework.dy4;

public class ArrayTask {
    public void showSumOfParticularArrayItems(int[] array, int eachNumber) {
        int sum = 0;
        for (int i = eachNumber - 1; i <= array.length; i++) {
            if (i % eachNumber == 0) {
                sum += array[i - 1];
            }
        }
        System.out.println("Sum of array items on each " + eachNumber + " position is: " + sum);
    }

}
