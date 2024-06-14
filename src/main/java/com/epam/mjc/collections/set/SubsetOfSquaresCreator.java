package com.epam.mjc.collections.set;

import java.util.*;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i : sourceList) {
            int number = i * i;
            treeSet.add(number);
        }

        SortedSet<Integer> integerSet = treeSet.subSet(lowerBound, upperBound+1);

        return integerSet;
    }
}
