package com.dsapractice.arrays;

import static java.lang.Math.max;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = maxSubArraySum(nums);
        System.out.println(maxSum);

    }

    private static int maxSubArraySum(int[] nums) {
        int maxsum=0; ;
        for(int i=0; i<nums.length;i++){
            int currsum =0;
            for(int j=i; j<nums.length; j++){
                currsum = currsum+nums[j];
                maxsum = max(currsum, maxsum);
            }
        }
        return maxsum;
    }
}
