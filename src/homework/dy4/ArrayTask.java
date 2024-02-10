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

    public int[] getNewArray(int[] oldArray, int numberToCompare) {
        int counter = 0;
        for (int i = 0; i < oldArray.length; i++) {
            if (oldArray[i] > numberToCompare) {
                counter++;
            }
        }
        int[] newArray = new int[counter];
        int position = 0;
        for (int j = 0; j < oldArray.length; j++) {

            if (oldArray[j] > numberToCompare) {
                newArray[position] = oldArray[j];
                position++;
            }
        }
        int[] revertedArray = this.revertPositionsOfArrayItems(newArray);

        return revertedArray;
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
}
