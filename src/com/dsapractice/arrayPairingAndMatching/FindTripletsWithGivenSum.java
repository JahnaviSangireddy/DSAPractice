package com.dsapractice.arrayPairingAndMatching;

import java.util.ArrayList;
import java.util.List;

public class FindTripletsWithGivenSum {
    public static void main(String[] args) {
        /*
        **Find Triplets with Given Sum**
    - Given an array, find all triplets that sum up to a given target.
    - Example: `Input: [1, 2, 3, 4, 5], Target: 8` → `Output: [(1, 2, 5), (1, 3, 4)]`
         */
        int [] input = {1, 2, 3, 4, 5};
        int target=8;
        List<int[]> list = findTripletPairs(input,target);
        for(int[] arr : list){
            System.out.println("("+arr[0]+","+arr[1]+","+arr[2]+")");
        }

    }

    private static List<int[]> findTripletPairs(int[] input, int target) {
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<input.length; i++){
            for(int j=i+1; j<input.length; j++){
                for(int k=j+1; k<input.length; k++){
                    if(input[i]+input[j]+input[k] == target){
                        list.add(new int[]{input[i],input[j],input[k]});
                    }
                }
            }
        }
        return list;
    }
}
