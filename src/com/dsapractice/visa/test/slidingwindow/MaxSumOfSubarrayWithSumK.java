package com.dsapractice.visa.test.slidingwindow;

import static java.lang.Math.max;

public class MaxSumOfSubarrayWithSumK {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2}, k = 3;
        int maxsum = findMaxSum(arr,k);
        System.out.println(maxsum);
    }

    private static int findMaxSum(int[] arr, int k) {
        int st=0, end=0; int sum=0, maxsum=0;
        for(int i=0; i<k; i++){
            sum = sum+arr[i];
        }
        maxsum = max(sum,maxsum);
        end=k;
        while(end<arr.length){
            sum = sum+arr[end]-arr[st];
            maxsum = max(sum,maxsum);
            end++;
            st++;
        }
        return maxsum;
    }
}
