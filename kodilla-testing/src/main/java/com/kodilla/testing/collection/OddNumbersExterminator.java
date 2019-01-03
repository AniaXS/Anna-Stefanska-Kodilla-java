package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    private List<Integer> oddNumbers = new ArrayList<Integer>();

    public List<Integer> exterminate(List<Integer> numbers) {
        for (Integer element : numbers) {
            if (element % 2 == 0) {
                oddNumbers.add(element);
            }
        }
        return oddNumbers;
    }
}