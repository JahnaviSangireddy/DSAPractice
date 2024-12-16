package com.dsapractice.twoDArrays;

public class FindMaximumElmAndPosition {
    public static void main(String[] args) {
        /*
        Find the maximum element in a 2D array and its position.
         */
        int arr[][]={{1,6,13},{4,5,6},{7,8,9}};
        int[] maxelm = findMaxElm(arr);
        for(int i : maxelm)
        System.out.print(i+" ");
    }

    private static int[] findMaxElm(int[][] arr) {
        int maxelm =Integer.MIN_VALUE;
        int [] maxelmarr = new int[0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] > maxelm){
                    maxelm = arr[i][j];
                    maxelmarr = new int[]{maxelm,i,j};
                }
            }
        }
        return maxelmarr;
    }
}
