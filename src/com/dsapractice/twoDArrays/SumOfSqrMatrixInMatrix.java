package com.dsapractice.twoDArrays;

public class SumOfSqrMatrixInMatrix {
    public static void main(String[] args) {
        int matrix[][] ={
                {7, 4, 0, 1},
                {5, 6, 2, 2},
                {6, 10, 7, 8},
                {1, 4, 2, 0}
        };
        int output[][] = findSum(matrix);
        for(int i=0; i<output.length; i++){
            for(int j=0; j<output[i].length; j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] findSum(int[][] matrix) {
        int avg=0;
        int gridsum[][] = new int [2][2];
        for(int startrow =0; startrow <=matrix.length-3; startrow++){
            for(int startcol=0; startcol<=matrix.length-3; startcol++){

                int sum=0;
                for(int row=startrow; row<startrow+3; row++){
                    for(int col = startcol; col < startcol+3; col++){
                        sum = sum + matrix[row][col];
                        System.out.print(matrix[row][col]+" ");
                    }
                    System.out.println();
                }
                avg = sum/9;
                System.out.println("avg :"+avg);
                gridsum[startrow][startcol] = avg;
            }
        }
       return gridsum;
    }
}
