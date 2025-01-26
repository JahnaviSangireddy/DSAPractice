package com.dsapractice.visa.test.slidingwindow;

import static java.lang.Math.min;

public class SmallestSubarrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, 4, 3}, s=7;
        int minlen = findMinlength(arr,s);
        System.out.println(minlen);
    }

    private static int findMinlength(int[] arr, int s) {
        int st=0, end=0,len=0, minlen=Integer.MAX_VALUE, sum=0;
        while(end<arr.length){
            sum = sum + arr[end];
            while(sum >= s){
                len = end-st+1;
                minlen = min(len,minlen);
                sum = sum - arr[st];
                st++;
            }
            end++;
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}
