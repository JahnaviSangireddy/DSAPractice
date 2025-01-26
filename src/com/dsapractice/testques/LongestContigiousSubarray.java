package com.dsapractice.testques;

public class LongestContigiousSubarray {
    public static void main(String[] args) {
        /*
        Given an array of integers nums and an integer limit,
        return the size of the longest non-empty subarray such that the absolute
        difference between any two elements of this subarray is less than or equal to
         limit.
         */

        int nums[] = {8,2,4,7}; int limit = 4;
        int lengthOfLongestSubArray = findlength(nums,limit);
        System.out.println(lengthOfLongestSubArray);
    }

    private static int findlength(int[] nums, int limit) {
        int st=0; int end=st+1; int winlen = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=st; j<end; j++){
                int diff = nums[j+1];
            }
        }
        return 0;
    }
}
