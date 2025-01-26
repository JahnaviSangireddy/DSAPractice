package com.dsapractice.slidingWindow;

import static java.lang.Math.min;

public class MinPositiveSumSubArray {
    public static void main(String[] args) {
        /*
        You are given an integer array nums and two integers l and r. Your task is to find the minimum sum of a subarray whose size is between l and r (inclusive) and whose sum is greater than 0.

Return the minimum sum of such a subarray. If no such subarray exists, return -1.
Input: nums = [3, -2, 1, 4], l = 2, r = 3

Output: 1
         */
        int nums[] = {3, -2, 1, 4}; int l=2, r=3;
        int minsum = minSum(nums,l,r);
        System.out.println(minsum);
    }

    private static int minSum(int[] nums, int l, int r) {
        int st=0,end=0,sum=0,minsum=Integer.MAX_VALUE;
        while(end<nums.length){
            sum = sum+nums[end];
            int len = end-st+1;
            if(sum > 0 && len>=l){
                minsum = min(minsum,sum);
            }
            if(len>r){
                sum = sum - nums[st];
                st++;
            }
            end++;
        }
        return minsum==Integer.MAX_VALUE ? -1 : minsum;
    }
}
