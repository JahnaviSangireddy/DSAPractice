package com.dsapractice.twoDArrays;

public class CheckSymetricMatrix {
    public static void main(String[] args) {
        /*
            Check if a given square matrix is symmetric (a matrix is symmetric if it
            is equal to its transpose).

         */
        int arr[][]={{1,2,3},{2,4,5},{3,5,6}};
        int outarr[][] = transposeOfMatrix(arr);
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length; j++){
                System.out.print(outarr[i][j]+" ");
            }
            System.out.println();
        }
        boolean issymmetric = checkSymmetric(arr);
        System.out.println(issymmetric);
    }

    private static boolean checkSymmetric(int[][] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j] != arr[j][i])
                    return false;
            }
        }
        return true;
    }

    private static int[][] transposeOfMatrix(int[][] arr) {
        int outarr[][] = new int[arr.length][arr[0].length];
        for(int j=0, p=0; j<arr.length && p< arr.length; j++, p++){
            for(int i=0, q=0; i<arr.length && q< arr.length; i++,q++){
                outarr[p][q] = arr[i][j];
            }
        }
        return outarr;
    }
}
