package main.java.com.volkova.fruitslist;

import java.util.ArrayList;

public class FruitsList {
    ArrayList<String> fruits = new ArrayList<>();

    public void addFruit(){
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Apricot");
        fruits.add("Banana");
        fruits.add("Grapefruit");
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Mango");
    }
    public void findAndReplaceOrange(){
        if (fruits.contains("Orange")){
            int orange = fruits.indexOf("Orange");
            fruits.set(orange, "Grapefruit");
            System.out.println(fruits);
        }
        else{
            System.out.println("Ooooops, we not found Orange!");
        }
    }
}