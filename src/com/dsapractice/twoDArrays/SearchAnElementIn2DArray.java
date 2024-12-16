package com.dsapractice.twoDArrays;

public class SearchAnElementIn2DArray {
    public static void main(String[] args) {
        /*
        Search for a specific element in the 2D array and print its position (row and column).
         */
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int elm = 16;
        int index[] = searchelm(arr,elm);
        System.out.println(index[0]+" "+index[1]);
    }

    private static int[] searchelm(int[][] arr, int elm) {
        int index[] = {-1,-1};
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == elm){
                    index[0] = i; index[1]= j;
                    break;
                }
            }
        }
        return index;
    }
}
