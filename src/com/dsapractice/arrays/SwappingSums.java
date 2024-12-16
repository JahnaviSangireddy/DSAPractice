package com.dsapractice.arrays;

public class SwappingSums {
    public static void main(String[] args) {
        /*
    Given two arrays of integers a and b of the same length,
    find the number of pairs (i, j) such that i ≠ j and a[i] - b[j] = a[j] - b[i].
    Example
    • For a = [2, -2, 5, 3] and b = [1, 5, -1, 1], the output should be solution(a, b) = 6.
         */

        int a[] = {2, -2, 5, 3};
        int b[] = {1, 5, -1, 1};

        int a1[] = {25,0};
        int b1[] = {0,25};

        int pairs = findSwappingSumPairs(a1,b1);
        System.out.println(pairs);
    }

    private static int findSwappingSumPairs(int[] a, int[] b) {
        int noOfPairs=0;
        for(int i=0; i<a.length;i++){
            for(int j=i; j<b.length; j++){
                if(a[i] - b[j] == a[j] - b[i]){
                    System.out.println(i +", "+j);
                    noOfPairs++;
                }
            }
        }
        return noOfPairs;
    }
}
