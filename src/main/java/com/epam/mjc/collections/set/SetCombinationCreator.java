package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> stringSet = new HashSet<>();

        for (String i : thirdSet) {
            if (!(firstSet.contains(i) || secondSet.contains(i))) {
                stringSet.add(i);
            }
        }

        for (String i : firstSet) {
            if (secondSet.contains(i) && !(thirdSet.contains(i))) {
                stringSet.add(i);
            }
        }

        for (String i : secondSet) {
            if (firstSet.contains(i) && !(thirdSet.contains(i))) {
                stringSet.add(i);
            }
        }

        return stringSet;
    }
}
