package com.dsapractice.codesignalIntro;

public class AbsoluteValueSumMinimize {
    public static void main(String[] args) {
        /*
         Given a sorted array of integers a, your task is to determine which element
    of a is closest to all other values of a.
    In other words, find the element x in a, which minimizes the following sum:

    abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x)
    (where abs denotes the absolute value)

    If there are several possible answers, output the smallest one.

    Example

    For a = [2, 4, 7], the output should be solution(a) = 4.
    for x = 2, the value will be abs(2 - 2) + abs(4 - 2) + abs(7 - 2) = 7.
    for x = 4, the value will be abs(2 - 4) + abs(4 - 4) + abs(7 - 4) = 5.
    for x = 7, the value will be abs(2 - 7) + abs(4 - 7) + abs(7 - 7) = 8.
    The lowest possible value is when x = 4, so the answer is 4.
         */
        int arr[] ={2, 4, 7, 8};
        int val = findLowestValue(arr);
        System.out.println(val);
    }

    private static int findLowestValue(int[] arr) {
        int minsum =Integer.MAX_VALUE; int val = 0;
        for(int i=0; i<arr.length; i++){
            int sum=0; int x=arr[i];
            for(int j=0;j<arr.length;j++){
                sum = sum+Math.abs(arr[j] - x);
            }
            if(sum < minsum){
                minsum = sum;
                val = x;
            }
        }
        return val;
    }
}
