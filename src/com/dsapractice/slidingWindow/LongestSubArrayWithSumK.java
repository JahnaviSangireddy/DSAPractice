package com.dsapractice.slidingWindow;

import static java.lang.Math.max;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 0};
        int k=15;
        int maxlength = lengthOfLongestSubArrayWithSumK(arr,k);
        System.out.println(maxlength);
    }

    private static int lengthOfLongestSubArrayWithSumK(int[] arr, int k) {
        int i=0; int j=0; int maxsum=0; int maxlength =0; int sum=0;
        while(j<arr.length){
             sum = sum + arr[j];
            while(sum > k){
                sum = sum - arr[i];
                i++;
            }
            if(sum==k){
                maxlength = max(maxlength, j-i+1);
            }
            j++;
        }
        return maxlength;
    }
}
