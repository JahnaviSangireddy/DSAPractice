package com.dsapractice.slidingWindow;

import static java.lang.Math.max;

public class MaxSubArraySumOfSizeK {
    public static void main(String[] args) {
        /*
        Input: nums = [2, 1, 5, 1, 3, 2], k = 3
Output: 9
Explanation: The subarray [5, 1, 3] has the maximum sum 9
         */
        int nums[] = {2, 1, 5, 1, 4, 3, 2};
        int k=3;
        int maxsum= findMaxSubArraySum(nums,k);
        System.out.println(maxsum);
    }

    private static int findMaxSubArraySum(int[] nums, int k) {
        int winst=0, winend=0, sum=0, maxsum=0, winsize=k;
        for(int i=winend; i<winsize; i++){
            sum = sum+ nums[i];
        }
        for(int i=winsize; i<nums.length; i++){
            sum = sum +nums[i] - nums[winst];
            maxsum = max(sum,maxsum);
            winst++;
        }
        return maxsum;
    }
}
