package com.dsapractice.twoDArrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int mat1[][] = {
                        {1, 2, 3},
                        {4, 5, 6}
                        };
        int mat2[][] = {
                        {1,2},
                        {3,4},
                        {5,6}
                        };
        /*
        If mat1 is (m x n), mat2 is (p x q) => condition is  n==p => result is (m x q)
        mat1 is (2x3), mat2 is(3x2) => result is (2x2)

        1 2 3   1 2     1*1 + 2*3 + 3*5   1*2 + 2*4 + 3*6   22 28
        4 5 6   3 4     4*1 + 5*3 + 6*5   4*2 + 5*4 + 6*6   49 64
                5 6
         */

        int res[][] = multiplymatrix(mat1,mat2);
        for(int i=0; i< res.length; i++){
            for(int j=0; j<res[i].length; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] multiplymatrix(int[][] mat1, int[][] mat2) {
        int m=mat1.length; int n = mat1[0].length;
        int p= mat2.length; int q = mat2[0].length;

        if(n!=p){
            System.out.println("cannot multiply matrixes");
        }
        int res[][] = new int [m][q];
        for(int i=0; i< m; i++){
            for(int j=0; j<q; j++){
                for(int k=0; k<p; k++){
                    res[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return res;
    }
}
