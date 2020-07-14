package main.java.com.volkova;

import main.java.com.volkova.datavalues.DataValues;
import main.java.com.volkova.fruitslist.FruitsList;
import main.java.com.volkova.valueslist.ValuesList;

public class Main {
    public static void main(String[] args) {

        ValuesList a = new ValuesList();
        a.addInt();
        a.deleteInteger();

        FruitsList b = new FruitsList();
        b.addFruit();
        b.findAndReplaceOrange();

        DataValues c = new DataValues();
        c.addInteger();
        c.findMatch();
    }
}