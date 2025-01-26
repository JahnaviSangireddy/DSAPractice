package com.dsapractice.visa.test.slidingwindow;

import static java.lang.Math.max;

public class MaximumConseqOnes {
    public static void main(String[] args) {
        /*
        Given a binary array nums and an integer k,
        return the maximum number of consecutive 1's you can get by flipping at most k 0's.

         */
        int nums[] = {1,1,0,0,1,1,1,0,1,0,1,1}, k = 2;
        int maxlen = findMaxlenOfOnes(nums,k);
        System.out.println(maxlen);

    }

    private static int findMaxlenOfOnes(int[] nums, int k) {
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
            len = end-st+1;
            maxlen = max(len,maxlen);
            end++;
        }
        return maxlen;
    }
}
