package com.dsapractice.slidingWindow;

import static java.lang.Math.min;

public class MinLengthOfSubArrayWithSumGrtk {
    public static void main(String[] args) {
        /*
        Given an array of positive integers and a target sum s, find the length of the smallest contiguous subarray whose sum is greater than or equal to s. Return 0 if no such subarray exists.
Example:
Input: nums = [2, 3, 1, 2, 4, 3], s = 7
Output: 2
Explanation: The subarray [4, 3] has the minimal length under the problem constraint.

         */
        int nums[]={2, 3, 1, 2, 4, 3}; int s=7;
        int minlen = findMinLengthOfSubArrayWithSumGrtk(nums,s);
        System.out.println(minlen);
    }

    private static int findMinLengthOfSubArrayWithSumGrtk(int[] nums, int s) {
        int st=0, end=0, sum=0, len=0, minlen=Integer.MAX_VALUE;
        while(end<nums.length-1){
            sum = sum+nums[end];
            while(sum>=7){
                sum = sum - nums[st];
                st++;
                len = end - st +1;
                minlen = min(len,minlen);
            }
            end++;
        }
        return minlen;
    }
}
