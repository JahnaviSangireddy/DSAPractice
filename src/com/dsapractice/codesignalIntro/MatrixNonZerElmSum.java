package com.dsapractice.codesignalIntro;

public class MatrixNonZerElmSum {
    public static void main(String[] args) {
        /*
        Problem
    --------------------------------------------------------------------------------
    After becoming famous, the CodeBots decided to move into a new building
    together. Each of the rooms has a different cost, and some of them are free,
    but there's a rumour that all the free rooms are haunted! Since the CodeBots
    are quite superstitious, they refuse to stay in any of the free rooms, or
    any of the rooms below any of the free rooms.

    Given matrix, a rectangular matrix of integers, where each value represents
    the cost of the room, your task is to return the total sum of all rooms that
    are suitable for the CodeBots (ie: add up all the values that don't appear
    below a 0).

    Example

    For

    matrix = [[0, 1, 1, 2],
             [0, 5, 0, 0],
             [2, 0, 3, 3]]

    the output should be solution(matrix) = 9
         */
        int matrix[][] = {{0, 1, 1, 2},
                          {0, 5, 0, 0},
                          {2, 0, 3, 3}};
        int sum = findsolution(matrix);
        System.out.println(sum);
    }

    private static int findsolution(int[][] matrix) {
        int totalsum =0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length;j++){
                totalsum+=matrix[i][j];
                if(i!=0 && matrix[i-1][j] == 0){
                    totalsum= totalsum - matrix[i][j];
                }
            }
        }
        return totalsum;
    }
}
