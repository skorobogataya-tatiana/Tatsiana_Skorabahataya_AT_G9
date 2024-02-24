package classwork.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyTestCollections {
    public static void main(String[] args) {

        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList1.add("hello " + i);
        }
        System.out.println("Time of filling of ArrayList is: " + (System.currentTimeMillis() - t0));

        t0 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList2.add("hello " + i);
        }
        System.out.println("Time of filling of LinkedList iteration is: " + (System.currentTimeMillis() - t0));

        t0 = System.currentTimeMillis();
        for (String word : myList1) {

        }
        System.out.println("Time of iteration of ArrayList is: " + (System.currentTimeMillis() - t0));

        t0 = System.currentTimeMillis();
        for (String word : myList2) {

        }
        System.out.println("Time of iteration of LinkedList iteration is: " + (System.currentTimeMillis() - t0));
    }
}
