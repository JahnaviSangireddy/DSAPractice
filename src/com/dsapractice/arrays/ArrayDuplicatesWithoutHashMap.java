package com.dsapractice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDuplicatesWithoutHashMap {

    public static void main(String[] args) {
        // Given an array arr of integers, find all the elements that occur more than
        // once in the array. Return the result in ascending order.
        // If no element repeats, return an empty array.
        //Approach:
        //1.sort the array.
        //2. compare adj elmns. if equal put in list and return

        int arr[] = {2, 3, 1, 2, 3, 2, 3};
        List<Integer> list = getDuplicateNums(arr);
        System.out.println(list);
    }

    private static List<Integer> getDuplicateNums(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=1;i< arr.length;i++){
            if(arr[i] == arr[i-1] ) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr[i]) {
                    list.add(arr[i]);
                }
            }
        }
        return list;
    }
}
