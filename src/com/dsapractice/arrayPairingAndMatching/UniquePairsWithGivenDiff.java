package com.dsapractice.arrayPairingAndMatching;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UniquePairsWithGivenDiff {
    public static void main(String[] args) {
        /*
        Find Unique Pairs with Given Difference**
   - Given an array of integers and a target difference, find unique pairs where the difference between two numbers equals the target.
   - Example: `Input: [1, 5, 3, 4, 2], Target: 2` → `Output: [(1, 3), (3, 5)]`
         */
        int arr[] = {1, 5, 3, 4, 2};
        int target=2;
        List<int[]> output = findDiffPairs(arr,target);
        for(int[] a : output){
            System.out.println("("+a[0]+","+a[1]+")");
        }
    }

    private static List<int[]> findDiffPairs(int[] arr, int target) {
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(Math.abs(arr[i]-arr[j]) == target){
                    list.add(new int[]{arr[i],arr[j]});
                }
            }
        }
        return list;
    }
}
