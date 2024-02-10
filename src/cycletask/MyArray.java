package cycletask;

import java.util.Random;

public class MyArray {
    int[] smiles = new int[7];

    public void putSmiles() {

        Random random = new Random();
        for (int i = 0; i < smiles.length; i++) {
            smiles[i] = random.nextInt(20);
        }
    }

    public void showSmiles() {
        for (int i = 0; i < smiles.length; i++) {
            System.out.println("Smile " + i + " is: " + smiles[i]);
        }
        System.out.println();
    }

    public void showSmilesReverseOrder() {
        for (int i = smiles.length - 1; i >= 0; i--) {
            System.out.println("Smile " + i + " is: " + smiles[i]);
        }
        System.out.println();
    }

    public void showMultipliedSmiles() {
        for (int i = 0; i < smiles.length; i++) {
            System.out.println("Smile " + smiles[i] + " multiplied by 5 is: " + smiles[i] * 5);
        }
        System.out.println();
    }

    public void showSquareSmiles() {
        for (int i = 0; i < smiles.length; i++) {
            System.out.println("Smile " + smiles[i] + " in square is: " + smiles[i] * smiles[i]);
        }
        System.out.println();
    }

    public void showMinSmile() {
        int min = smiles[0];
        for (int i = 0; i < smiles.length; i++) {
            if (smiles[i] < min) {
                min = smiles[i];
            }
        }
        System.out.println("The smallest number in the array is: " + min);
        System.out.println();
    }


    public void changeSmiles() {

        int temp = smiles[0];
        smiles[0] = smiles[smiles.length - 1];
        smiles[smiles.length - 1] = temp;
        for (int i = 0; i < smiles.length; i++) {
            System.out.println("Smile on position " + i + " is: " + smiles[i]);
        }
        System.out.println();
    }

    public void showSortedSmiles() {
        int temp;

        for (int i = 0; i < smiles.length - 1; i++) {
            for (int j = smiles.length - 1; j > i; j--) {
                if (smiles[j] > smiles[j - 1]) {
                    temp = smiles[j];
                    smiles[j] = smiles[j - 1];
                    smiles[j - 1] = temp;
                }
            }
        }

        System.out.println("Here is the sorted smiles values:");
        for (int i = 0; i < smiles.length; i++) {
            System.out.println("Smile on position " + i + " is: " + smiles[i]);
        }
    }

}
