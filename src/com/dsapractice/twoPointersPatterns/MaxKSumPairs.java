package com.dsapractice.twoPointersPatterns;

import java.util.Arrays;

public class MaxKSumPairs {
    public static void main(String[] args) {
        int nums [] = {3,1,3,4,3}; int k = 6;
        int count = maxKSumPairs(nums,k);
        System.out.println(count);
    }

    private static int maxKSumPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0; int j= nums.length-1; int count = 0;
        while(i<j){
            if(nums[i] + nums[j] == k){
                count++;
                i++; j--;
            }else if(nums[i] + nums[j] > k){
                j--;
            }else if(nums[i] + nums[j] < k){
                i++;
            }
        }
        return count;
    }
}
