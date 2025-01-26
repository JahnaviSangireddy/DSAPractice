package com.dsapractice.visa.test.slidingwindow;

import static java.lang.Math.max;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 7, 5, 0}, k = 15;
        int maxlen = findLongestSubArray(nums,k);
        System.out.println(maxlen);
    }

    private static int findLongestSubArray(int[] nums, int k) {
        int st=0, end=0,len=0, maxlen=0, sum=0;
        while(end<nums.length){
            sum = sum+nums[end];
            while(sum > k && st<nums.length){
                sum = sum - nums[st];
                st++;
            }
            if(sum == k){
                len = end-st+1;
                maxlen = max(len,maxlen);
            }
            end++;
        }
        return maxlen;
    }
}
