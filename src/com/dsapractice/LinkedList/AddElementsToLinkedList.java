package com.dsapractice.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddElementsToLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        Linkedlist llist = new Linkedlist();
        for(int i : list){
            llist.add(i);
        }
        llist.printLinkedlist();
    }
}
