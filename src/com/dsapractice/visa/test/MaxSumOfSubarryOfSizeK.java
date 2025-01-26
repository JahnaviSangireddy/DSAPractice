package com.dsapractice.visa.test;

import static java.lang.Math.max;

public class MaxSumOfSubarryOfSizeK {
    public static void main(String[] args) {
        int nums[]= {1, 2, 3, 4, 5}, k = 3;
        int maxsum= findMaxSum1(nums,k);
        System.out.println(maxsum);
    }

    private static int findMaxSum1(int[] nums, int k) {
        int st=0, end=0;
        int sum=0, maxsum=0;

        for(int i=0; i<k; i++){
            sum = sum+nums[end];
            end++;
        }
        maxsum = max(sum,maxsum);
        while(end< nums.length){
            sum = sum + nums[end] - nums[st];
            st++;
            maxsum = max(sum,maxsum);
            end++;
        }
        return maxsum;
    }
}
