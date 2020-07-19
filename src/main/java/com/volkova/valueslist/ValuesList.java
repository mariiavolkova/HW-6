package main.java.com.volkova.valueslist;

import java.util.ArrayList;
import java.util.List;

public class ValuesList<T> {
    List<Integer> integerList = new ArrayList<>();

    public void addInt() {
        integerList.add(3);
        integerList.add(9);
        integerList.add(11);
        integerList.add(18);
        integerList.add(20);
        integerList.add(22);
    }

    public void deleteInteger() {
        integerList.removeIf(integer -> integer % 3 == 0);
        System.out.println("This Numbers not divide by 3: ");
        integerList.forEach(integer -> System.out.println(integer + "   "));
    }
}
