package com.dsapractice.twoDArrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        /*
        Given a square matrix, find its transpose (interchange rows and columns).
          i/p
            1 2 3
            4 5 6
            7 8 9
          o/p
           1 4 7
           2 5 6
           3 6 9
         */
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int outarr[][] = transposeOfMatrix(arr);
        for(int p=0; p< outarr.length; p++){
            for(int q=0; q<outarr[p].length;q++){

                System.out.print(outarr[p][q]+" ");
            }
            System.out.println();
        }

    }

    private static int [][]  transposeOfMatrix(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int outarr[][] = new int[m][n];
        for(int j=0,p=0; j<n && p<n; j++,p++){
            for(int i=0,q=0; i<m && q<m;i++,q++){
                outarr[p][q] = arr[i][j];
            }
        }
        return outarr;
    }
}
