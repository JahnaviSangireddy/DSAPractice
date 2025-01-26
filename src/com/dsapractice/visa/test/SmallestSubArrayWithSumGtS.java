package com.dsapractice.visa.test;

import static java.lang.Math.min;

public class SmallestSubArrayWithSumGtS {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, 4, 3};
        int s=7;
        int minlen = findSmallestSubArray(arr, s);
        System.out.println(minlen);
    }

    private static int findSmallestSubArray(int[] arr, int s) {
        int st=0, end=0,len=0, minlen=Integer.MAX_VALUE; int sum=0;
        while(end<arr.length){
            sum = sum + arr[end];
            while(sum >= s){
                len = end-st+1;
                minlen = min(len, minlen);
                sum = sum - arr[st];
                st++;
            }

            end++;
        }
        return (minlen==Integer.MIN_VALUE) ? 0 : minlen;
    }
}
//3, 5, 8, 10 pblms