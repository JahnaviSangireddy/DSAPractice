package com.dsapractice.codesignalIntro;

public class SumOfSqrMatrixInAMatrix {
    public static void main(String[] args) {
        /*
        For image =
        [
            [7, 4, 0, 1],
            [5, 6, 2, 2],
            [6, 10, 7, 8],
            [1, 4, 2, 0]
        ]

    the output should be
    solution(image) =
        [
            [5, 4],
            [4, 4]
        ]

    There are four 3 × 3 squares in the input image, so there should be
    four integers in the blurred output. To get the first value:
    (7 + 4 + 0 + 5 + 6 + 2 + 6 + 10 + 7) = 47 / 9 = 5.2222 = 5.
    The other three integers are obtained the same way, then the surrounding
    integers are cropped from the final result.
         */
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
    //    {7, 4, 0, 1},
    //    {5, 6, 2, 2},
    //    {6, 10, 7, 8},
    //    {1, 4, 2, 0}
        int outmat[][] = new int [2][2];
        int sum=0; int avg =0;

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int startRow = 0; startRow <= rows - 3; startRow++) {
            for (int startCol = 0; startCol <= cols - 3; startCol++) {
                System.out.println("3x3 Submatrix starting at (" + startRow + ", " + startCol + "):");
                // Extract and print the 3x3 submatrix
                sum=0;
                for (int i = startRow; i < startRow + 3; i++) {
                    for (int j = startCol; j < startCol + 3; j++) {
                        System.out.print(matrix[i][j] + " ");
                        sum = sum+matrix[i][j];
                    }
                    System.out.println();
                }
                avg = sum/9;
                outmat[startRow][startCol] = avg;
                System.out.println();
            }
        }
        return outmat;
    }
}
