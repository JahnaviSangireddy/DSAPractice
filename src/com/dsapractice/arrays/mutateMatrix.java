package com.dsapractice.arrays;

public class mutateMatrix {
    /*
    Given a square matrix of integers a and an array of queries q, your task is to return the given matrix after processing all the queries on it. There are three
types of queries:
" If q[i] = 0, rotate the matrix 9e degrees clockwise.
" If q[i) = 1, reflect the matrix in its main diagonal.
E
" If q[i) = 2, reflect the matrix in its secondary diagonal.
Note: You are not expected to provide the most optimal solution, but a solution
with timne complexity not worse than o(g. leng th a. length²) will fit within the execution time limit.
     */
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix1 = {
                {5, 5},
                {1, 2}
        };
        int[] queries = {0, 1, 2}; // Example queries
        int[] queries1 = {2,0,2,0,1};
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        reversecols(matrix);
        System.out.println("****************");
        printMatrix(matrix);
      //  processQueries(matrix1, queries1);

      //  System.out.println("\nTransformed Matrix:");
     //   printMatrix(matrix1);
    }

    private static void reversecols(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            int st=0;
            int end = matrix.length-1;
            while(st<end){
                int temp = matrix[st][i];
                matrix[st][i] = matrix[end][i];
                matrix[end][i] = temp;
                st++; end--;
            }
        }
    }

    private static void processQueries(int[][] matrix, int[] queries) {
        for(int query : queries){
            switch (query){
                case 0:
                    rotateMatrix(matrix);
                    break;
                case 1:
                    reflectMainDiagonal(matrix);
                    break;
                case 2:
                    reflectSecondaryDiagonal(matrix);
                    break;
            }
        }
    }

    private static void reflectSecondaryDiagonal(int[][] matrix) {
        int n= matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][n-i-1];
                matrix[n-j-1][n-i-1] = temp;
            }
        }
    }

    private static void reflectMainDiagonal(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static void rotateMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse rows
        for(int i=0; i<matrix.length; i++){
            int st = 0;
            int end=matrix.length-1;
            while(st<end){
                int t = matrix[i][st];
                matrix[i][st] = matrix[i][end];
                matrix[i][end] = t;
                st++;
                end--;
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
}
