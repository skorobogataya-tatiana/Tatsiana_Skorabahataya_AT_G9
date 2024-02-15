package homework.day4;

import java.time.LocalDate;

public class ArrayTask {

    int currentMonth = LocalDate.now().getMonthValue();

      public void showSumOfParticularArrayItems(int[] array, int eachNumber) {
        int sum = 0;
          for (int i = eachNumber - 1; i <= array.length; i++) {
              if (i % eachNumber == 0) {
                  sum += array[i - 1];
              }
        }
        System.out.println("Sum of array items on each " + eachNumber + " position is: " + sum);
    }

    public int[] getNewArray(int[] oldArray, int numberToCompare) {
        int counter = 0;
        for (int i : oldArray) {
            if (i > numberToCompare) {
                counter++;
            }
        }
        int[] newArray = new int[counter];
        int position = 0;
        for (int j : oldArray) {

            if (j > numberToCompare) {
                newArray[position] = j;
                position++;
            }
        }

        return revertPositionsOfArrayItems(newArray);
    }

    private int[] revertPositionsOfArrayItems(int[] array) {
        int temp;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        return array;
    }

    public void showRevertedArray(int[] array) {
        System.out.println("The reverted view of the array is: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public int getSumOfArrayItems(int[] someArray, int currentMonth) {
          int sum = 0;
          for(int i : someArray) {
              if(i % currentMonth == 0) {
                  sum += i;
              }
          }
          return sum;
    }

    public void drawHorse() {
        System.out.println("\t  ^__^");
        System.out.println("\t  (oo)\\\\_______");
        System.out.println("\t (__)\\ ) \\/\\  \\");
        System.out.println("\t      ||----w |\\");
        System.out.println("\t      ||     ||");
    }
}
