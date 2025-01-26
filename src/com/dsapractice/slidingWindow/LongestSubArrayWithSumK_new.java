package com.dsapractice.slidingWindow;

import static java.lang.Math.max;

public class LongestSubArrayWithSumK_new {
    public static void main(String[] args) {
        /*
        Longest Subarray with Sum K
Given an array of integers and an integer k, find the length of the longest
subarray with a sum equal to k.
Example:
Input: nums = [1, 2, 3, 7, 5], k = 12
Output: 4

         */
        int arr[] = {1, 2, 3, 7, 5}; int k=12;
        int len = lenOfLongestSubarryWithSumK(arr,k);
        System.out.println(len);
    }

    private static int lenOfLongestSubarryWithSumK(int[] arr, int k) {
        int st=0, end=0,sum=0,len=0,maxlen=0;
        while(end<arr.length-1){
            sum = sum + arr[end];
            end++;
            while(sum >=12){
                sum = sum - arr[st];
                st++;
                if(sum == 12){
                    len = end - st +1;
                    maxlen = max(len,maxlen);
                }
            }
        }
        return maxlen;
    }
}
