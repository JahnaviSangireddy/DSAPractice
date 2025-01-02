package com.dsapractice.codesignalIntro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindUnique2x2Matrixes {
    public static void main(String[] args) {
        /*
         Given a rectangular matrix containing only digits, calculate the number of
    different 2 × 2 squares in it.

    Example

    For matrix = [
        [1, 2, 1],
        [2, 2, 2],
        [2, 2, 2],
        [1, 2, 3],
        [2, 2, 1]
    ]

    the output should be solution(matrix) = 6.
         */
        int [][] matrix ={
                {1, 2, 1},
                {2, 2, 2},
                {2, 2, 2},
                {1, 2, 3},
                {2, 2, 1}
        };
        int count = findNumberOfUnique2x2Matrixes(matrix);
        System.out.println(count);
    }

    private static int findNumberOfUnique2x2Matrixes(int[][] matrix) {
        Set<String> matrixSet = new HashSet<>();

        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int rowstart =0; rowstart<=rows-2; rowstart++){
            for(int colstart = 0; colstart<=cols-2; colstart++){
                int arr[][] = new int[2][2];
                for(int i=rowstart, m=0; i<rowstart+2 && m<2; i++, m++){
                    for(int j=colstart, n=0; j<colstart+2 && n<2; j++,n++){
                        System.out.print(matrix[i][j]+" ");
                        arr[m][n] = matrix[i][j];
                    }
                    System.out.println();
                }
                System.out.println("******************");
                matrixSet.add(Arrays.deepToString(arr));
            }
        }
        return matrixSet.size();
    }
}
