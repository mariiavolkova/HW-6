package main.java.com.volkova.datavalues;

import java.util.ArrayList;

public class DataValues {
    ArrayList<Integer> firstList = new ArrayList<>();
    ArrayList<Integer> secondList = new ArrayList<>();

    public void addInteger() {
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);
        firstList.add(5);

        secondList.add(1);
        secondList.add(10);
        secondList.add(3);
        secondList.add(20);
        secondList.add(4);
    }

    public void findMatch() {
        firstList.retainAll(secondList);
        System.out.println("Common Values: " + firstList);
    }
}
