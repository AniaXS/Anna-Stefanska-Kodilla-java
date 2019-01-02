package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    private ArrayList<Integer> oddNumbers = new ArrayList<Integer>();

    public ArrayList<Integer> exterminate(List<Integer> numbers) {
        for (Integer element : numbers) {
            if (element % 2 == 0) {
                oddNumbers.add(element);
            }
        }
        return oddNumbers;
    }
}