package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator listComparator = new ListComparator();
        sourceList.sort(listComparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        double firstDigit = Double.parseDouble(a);
        double secondDigit = Double.parseDouble(b);
        double firstCompute = Math.pow(firstDigit, 2) * 5 + 3;
        double secondCompute = Math.pow(secondDigit, 2) * 5 + 3;
        if (firstCompute == secondCompute && firstDigit > secondDigit) {
            return 1;
        }
        if (firstCompute > secondCompute) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
