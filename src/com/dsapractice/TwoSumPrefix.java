package com.dsapractice;

import java.util.HashMap;
import java.util.Map;

public class TwoSumPrefix {
    public static void main(String[] args) {
        int arr[] ={4, 1, 2, 3, 1};
        int target =5;
        int arrindexes[] = findSumIndexes(arr,target);
        System.out.println(arrindexes[0]+" , "+ arrindexes[1]);
    }

    private static int[] findSumIndexes(int[] arr, int target) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int arrindexes[] = new int[2];
        for(int i=0; i< arr.length;i++){
            int more = target-arr[i];
            if(hmap.containsKey(more)){
                arrindexes[0] =hmap.get(more);
                arrindexes[1] = i;
            }else{
                hmap.put(arr[i],i);
            }
        }
        return arrindexes;
    }
}
