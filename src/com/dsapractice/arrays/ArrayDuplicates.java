package com.dsapractice.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayDuplicates {

    public static void main(String[] args) {

        // Given an array arr of integers, find all the elements that occur more than
        // once in the array. Return the result in ascending order.
        // If no element repeats, return an empty array.
        //Approach:
        //1. put the elements in hashmap with their count
        //2. iterate trough the hashmap and if count>1 add to list
        //3. sort the list and return Collections.sort(list);
        int arr[] = {2, 3, 1, 2, 3};
        List<Integer> list = getDuplicateNums(arr);
        System.out.println(list);
    }

    private static List<Integer> getDuplicateNums(int arr[]) {

        Map<Integer,Integer> countMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i: arr){
            countMap.put(i,(countMap.getOrDefault(i,0))+1);
        }

        countMap.forEach((k,v)-> System.out.println(k+" : "+v));

        for(Map.Entry<Integer, Integer> entry: countMap.entrySet()){
            if( entry.getValue()>1){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
