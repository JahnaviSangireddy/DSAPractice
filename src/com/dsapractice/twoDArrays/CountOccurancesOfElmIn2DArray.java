package com.dsapractice.twoDArrays;

public class CountOccurancesOfElmIn2DArray {
    public static void main(String[] args) {
        /*
        Count the number of times a specific element occurs in the 2D array.
         */
        int arr[][]={{1,6,3},{4,5,6},{7,8,9}};
        int elm = 6;
        int count = countelm(arr,elm);
        System.out.println(count);
    }

    private static int countelm(int[][] arr, int elm) {
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == elm){
                    count++;
                }
            }
        }
        return count;
    }
}
