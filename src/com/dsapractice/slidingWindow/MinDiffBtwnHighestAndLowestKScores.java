package com.dsapractice.slidingWindow;

import java.util.Arrays;

public class MinDiffBtwnHighestAndLowestKScores {
    public static void main(String[] args) {
        /*
        You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.

Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.

Return the minimum possible difference.

Input: nums = [9,4,1,7], k = 2
Output: 2
Explanation: There are six ways to pick score(s) of two students:
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.
- [9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.
The minimum possible difference is 2.
         */

        int nums[] = {9,4,1,7}; int k=2;
        int mindiff = minimumDifference(nums,k);
        System.out.println(mindiff);

    }
    public static int minimumDifference(int[] nums, int k) {
        int st=0, end=k, minscore=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0; i<=nums.length-k; i++){
            int score = nums[end-1] - nums[st];
            minscore = java.lang.Math.min(score,minscore);
            st++;end++;
        }
        return minscore;
    }
}
