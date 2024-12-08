package com.dsapractice.slidingWindow;

import static java.lang.Math.max;

public class MaxSumDistSubArrLK {
    public static void main(String[] args) {
        /*
        Maximum Sum of Distinct Subarrays With Length K
        You are given an integer array nums and an integer k.
        Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:

        The length of the subarray is k, and
        All the elements of the subarray are distinct.
        Return the maximum subarray sum of all the subarrays that meet the conditions.
        If no subarray meets the conditions, return 0.

        Input: nums = [1,5,4,2,9,9,9], k = 3
        Output: 15
        Explanation: The subarrays of nums with length 3 are:
        - [1,5,4] which meets the requirements and has a sum of 10.
        - [5,4,2] which meets the requirements and has a sum of 11.
        - [4,2,9] which meets the requirements and has a sum of 15.
        - [2,9,9] which does not meet the requirements because the element 9 is repeated.
        - [9,9,9] which does not meet the requirements because the element 9 is repeated.
        We return 15 because it is the maximum subarray sum of all the subarrays that
        meet the conditions
         */

        int nums[] = {1,5,4,4,2,9,9,9}; int k=3;
        int maxSum = findMaxSumOfSubArrays(nums,k);
        System.out.println(maxSum);

    }

    private static int findMaxSumOfSubArrays(int[] nums, int k) {
        int n= nums.length; int i=0,j=0, maxsum=0, sum=0; boolean distinct=false;
        while(k<=n){
            i=j;
            if(nums[i] != nums[i+1] && nums[i+1]!= nums[k-1] && nums[i] != nums[k-1]){
                distinct=true;
            }
            if(distinct){
                for(i=j; i<k;i++){
                    sum = sum + nums[i];
                }
            }
            maxsum = max(maxsum,sum);
            j++; k++;
            sum=0;
            distinct = false;
        }
        return maxsum;
    }
}
