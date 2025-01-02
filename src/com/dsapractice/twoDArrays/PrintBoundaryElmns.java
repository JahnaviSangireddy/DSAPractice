package com.dsapractice.twoDArrays;

public class PrintBoundaryElmns {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3, 10},
                {4, 5, 6, 11},
                {7, 8, 9, 12}
        };

        getBoundaryElmns(matrix);

    }

    private static void getBoundaryElmns(int[][] matrix) {

            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[0][j]+" ");
            }
        System.out.println();
            for(int k=matrix[0].length-1; k<matrix.length; k++){
                System.out.println(matrix[matrix.length-1][k]);
            }
            System.out.println();
///incomplete
    }
}