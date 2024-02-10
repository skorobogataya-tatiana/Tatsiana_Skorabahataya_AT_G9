package somepack;

import java.util.Random;

public class TestClass {
 int[] array = new int[7];

 public void fillArray() {

 //int[] fill = array;
 Random random = new Random();
     for (int i = 0; i<array.length; i++) {
         array[i] = random.nextInt(20);
     }
 }

 public void showArray() {
     for (int j : array) {
         System.out.println(j);
     }
 }

 public static void main(String[] args) {
     TestClass array = new TestClass();
     array.fillArray();
     array.showArray();
 }
}
