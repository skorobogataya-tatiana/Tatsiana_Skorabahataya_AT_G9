package cycletask;

public class OddNumbers {
    public void showOddNumbers() {
        for (int i = 3; i <= 19; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}
