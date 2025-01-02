package com.dsapractice.arrayPairingAndMatching;

import java.util.ArrayList;
import java.util.List;

public class PairsWhoseSumIsEqualToTarget {
    public static void main(String[] args) {
        /*
        **Find All Pairs with Given Sum**
   - Given an array of integers, find all pairs whose sum equals a given target.
   - Example: `Input: [1, 2, 3, 4, 5], Target: 5` → `Output: [(1, 4), (2, 3)]`

         */
        int arr[] = {1, 2, 3, 4, 5};
        int target = 5;
        List<int []> reslist = findPairs(arr,target);
        for(int [] resarr : reslist){
            System.out.println("("+resarr[0]+","+resarr[1]+")");
        }
    }

    private static List<int[]> findPairs(int[] arr, int target) {
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    list.add(new int[]{arr[i],arr[j]});
                }
            }
        }
        return list;
    }
}
