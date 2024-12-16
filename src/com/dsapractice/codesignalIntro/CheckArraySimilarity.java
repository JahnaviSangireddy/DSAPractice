package com.dsapractice.codesignalIntro;

import java.util.HashMap;
import java.util.Map;

public class CheckArraySimilarity {
    public static void main(String[] args) {
        /*
        Two arrays are called similar if one can be obtained from another by
    swapping at most one pair of elements in one of the arrays.

    Given two arrays a and b, check whether they are similar.

    Example
    For a = [1, 2, 3] and b = [2, 1, 3], the output should be
    solution(a, b) = true.

    We can obtain b from a by swapping 2 and 1 in b

     For a = [1, 2, 2] and b = [2, 1, 1], the output should be
    solution(a, b) = false.

    Any swap of any two elements either in a or in b won't make a and b equal.

         */
        int a[] = {0, 1, 1, 2, 3, 5, 8};
        int b[] = {0, 1, 8, 2, 3, 5, 1};
        boolean bool = checkSimilarity(a,b);
        System.out.println(bool);
    }

    private static boolean checkSimilarity(int[] a, int[] b) {
        Map<Integer,Integer> freqmap = new HashMap<>();
        for(int i : a){
            freqmap.put(i,freqmap.getOrDefault(i,0)+1);
        }
        for(int i : b){
            if(!freqmap.containsKey(i)){
                return false;
            }
            if(freqmap.get(i) > 0){
                int c= freqmap.get(i);
                freqmap.put(i, c=c-1);
            }
        }
       for(int i : freqmap.values()){
           if(i!=0)
               return false;
       }
       return true;
    }
}
