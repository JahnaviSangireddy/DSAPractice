package com.dsapractice.arrays;

import java.util.HashMap;
import java.util.Map;

public class ArraySubset {

    public static void main(String[] args) {
        //long a1[] = {10, 5, 2, 23, 19};
        //long a2[] = {19, 5, 3};
        Long[] a1 = {11L, 1L, 13L, 21L, 3L, 7L, 3L, 7L, 11L};
        Long[] a2 = {11L, 7L, 3L};
        String isSubset = isSubset(a1,a2,a1.length,a2.length);
        System.out.println(isSubset);
    }



    public static String isSubset( Long a1[], Long a2[], long n, long m) {

        String isSubset="Yes";

        Map<Long,Integer> countMap = new HashMap<>();
        for(long i: a1){
            countMap.put(i,countMap.getOrDefault(i,0)+1);
        }

        for(long i: a2){
            if(!countMap.containsKey(i) || countMap.get(i)==0 ){
                isSubset = "No";
            }
            countMap.put(i,countMap.get(i)-1);

        }
        return isSubset;

    }
}
