package com.dsapractice.twoDArrays;

public class ComputeSumOfMatrix {
    public static void main(String[] args) {
        /*
        Compute the sum of elements for each row and each column of a 2D array.
        1 2 3 = 6
        4 5 6 = 15
        7 8 9 = 24
        = = =
        12 15 18

        [0,0]+[1,0]+[2,0]
         [0,1]+[1,1]+[2,1]
        [0,3]+[1,3]+[2,3]
         */
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<arr.length;i++){
            int rsum=0;
            for(int j=0; j<arr[i].length;j++){
                rsum = rsum+arr[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.print(rsum);
            System.out.println();
        }

        for(int j=0; j<arr.length;j++){
            int csum=0;
            for(int i=0;i<arr.length;i++){
                csum = csum+arr[i][j];
            }
            System.out.print(csum+" ");
        }
    }
}
