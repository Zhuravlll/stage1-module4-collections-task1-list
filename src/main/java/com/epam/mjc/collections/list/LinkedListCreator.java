package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> list = new LinkedList<>();
        for (Integer e : sourceList) {
            if (e % 2 == 0) {
                list.addLast(e);
            }
            else {
                list.addFirst(e);
            }
        }
        return list;
    }
}
