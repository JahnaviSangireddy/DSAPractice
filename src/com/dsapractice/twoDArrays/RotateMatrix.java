package com.dsapractice.twoDArrays;

public class RotateMatrix {
    public static void main(String[] args) {
        /*
        To rotate a matrix 90 ^0 clockwise
        1. transpose
        2. reverse all elms in every row

        To rotate a matrix 90 ^0 counterclockwise
        1. transpose
        2. reverse all elms in every column
         */

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        transposeMatrix(matrix);
        printMatrix(matrix);
        System.out.println("**************");
        reverseRows(matrix);
       // reverseColumns(matrix);
        printMatrix(matrix);
    }

    private static void reverseColumns(int[][] matrix) {
        for(int c=0; c<matrix.length; c++){
            int i=0; int j=matrix.length-1;
            while(i<j){
                int t = matrix[i][c];
                matrix[i][c] = matrix[j][c];
                matrix[j][c] = t;
                i++; j--;
            }
        }
    }

    private static void reverseRows(int[][] matrix) {

        for(int r=0; r<matrix.length; r++){
            int i=0; int j=matrix[r].length-1;
            while(i<j){
                int t = matrix[r][i];
                matrix[r][i] = matrix[r][j];
                matrix[r][j] = t;
                i++; j--;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void transposeMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j=i; j<matrix.length; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
    }
}
