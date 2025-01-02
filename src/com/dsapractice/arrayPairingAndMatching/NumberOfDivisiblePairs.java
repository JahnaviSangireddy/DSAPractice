package com.dsapractice.arrayPairingAndMatching;

import java.util.ArrayList;
import java.util.List;

public class NumberOfDivisiblePairs {
    public static void main(String[] args) {
        /*
        **Find Number of Divisible Pairs**
   - Count the number of pairs in an array such that the first number is divisible by the second.
   - Example: `Input: [1, 2, 4, 8]` → `Output: 5` (`(1,2), (1,4), (1,8), (2,4), (4,8)`)
         */
        int arr[] = {1, 2, 4, 8};
        List<int[]> res = findDivisiblePairs(arr);
        for(int[] r : res){
            System.out.println("("+r[0]+","+r[1]+")");
        }
        System.out.println(res.size());
    }

    private static List<int[]> findDivisiblePairs(int[] arr) {
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]%arr[i] == 0){
                    list.add(new int[]{arr[i], arr[j]});
                }
            }
        }
        return list;
    }
}
