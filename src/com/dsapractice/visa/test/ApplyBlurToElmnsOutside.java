package com.dsapractice.visa.test;

public class ApplyBlurToElmnsOutside {
    public static void main(String[] args) {
        int matrix [][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int radius=1;
        int bluredMatrix[][] = blurMatrix(matrix,radius);
        for(int i=0; i<bluredMatrix.length; i++){
            for (int j=0; j<bluredMatrix.length; j++){
                System.out.print(bluredMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] blurMatrix(int[][] matrix, int radius) {
            int m= matrix.length;
            int n= matrix[0].length;
            int bluredMatrix[][] = new int [m][n];
            int cx= m/2; int cy = n/2;
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(isWithinRadius(i,j, cx,cy,radius)){
                        bluredMatrix[i][j] = matrix[i][j];
                    }else{
                        bluredMatrix[i][j] = 0;
                    }

                }
            }
            return bluredMatrix;
    }

    private static boolean isWithinRadius(int x, int y, int cx, int cy, int radius) {
        int dx = x - cx;
        int dy = y - cy;
        return dx * dx + dy * dy <= radius * radius; // Check squared distance
    }

    private static int calculateDistance(int x2, int y2, int x1, int y1) {
        // distance= sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1))
        int value = ((x2-x1) * (x2-x1)) + ((y2-y1)*(y2-y1));
     //   int distance = (int) Math.sqrt(value);
        System.out.println(value);
        return value;
    }
}
