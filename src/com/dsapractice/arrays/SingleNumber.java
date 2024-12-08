package com.dsapractice.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    static int singleNum =0;

    public static int getSingleNum() {
        return singleNum;
    }

    public static void main(String[] args) {
        /*
        Given a non-empty array of integers nums, every element appears
        twice except for one. Find that single one.
        ex: nums = [2,2,1]
        op= 1
         */
        int nums[] = {2,2,1, 3, 3, 2, 2};

         getSingleNumber(nums);
        System.out.println(SingleNumber.getSingleNum());
    }

    private static int getSingleNumber(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            countMap.put(nums[i],countMap.getOrDefault(nums[i],0)+1);
        }

        countMap.forEach((k,v)->{

            if(v==1){
                singleNum = k;
            }
        });
        return singleNum;
    }
}
