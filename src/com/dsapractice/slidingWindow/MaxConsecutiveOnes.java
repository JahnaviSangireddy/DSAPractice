package com.dsapractice.slidingWindow;

import static java.lang.Math.max;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        /*
         Maximum Consecutive Ones III
Given a binary array nums and an integer k, return the maximum number of consecutive 1's you can get by flipping at most k 0's.
Example:
Input: nums = [1,1,0,0,1,1,1,0,1,0,1,1], k = 2
Output: 8

         */
        int nums[] = {1,1,0,0,1,1,1,0,1,0,1,1}; int k=2;
        int maxconsecutiveOnes = findMaxConOnes(nums,k);
        System.out.println(maxconsecutiveOnes);
    }

    private static int findMaxConOnes(int[] nums, int k) {
        int st=0, end=0, len=0, maxlen=0, zeros=0;

        while(end<nums.length){
            if(nums[end] == 0){
                zeros++;
            }
            while(zeros>k){
                if(nums[st]==0){
                    zeros--;
                }
                st++;
            }
            if(zeros==k){
                len = end-st+1;
                maxlen = max(len,maxlen);
            }
            end++;
        }
        return maxlen;
    }
}
