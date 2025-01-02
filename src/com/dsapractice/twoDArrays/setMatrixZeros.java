package com.dsapractice.twoDArrays;

public class setMatrixZeros {
    public static void main(String[] args) {
        /*
        If an element in a matrix is 0, set its entire row and column to 0.

         */

        int matrix[][] = {
                {1, 2, 3},
                {4, 0, 6},
                {0, 8, 9}
        };

        setZeros(matrix);
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void setZeros(int[][] matrix) {
        boolean rows[] = new boolean[matrix.length];
        boolean cols[] = new boolean[matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(matrix[i][j] ==0){
                    rows[i]=true;
                    cols[j] = true;
                }
            }
        }

        for(int i=0; i<matrix.length;i++){
            if(rows[i]){
                for(int j=0; j<matrix.length;j++){
                    matrix[i][j]=0;
                }
            }
        }

        for(int j=0; j<matrix.length;j++){
            if(cols[j]){
                for(int i=0; i<matrix.length;i++){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
