package com.dsapractice.twoDArrays;

import java.util.Scanner;

public class Take2DArrayipAndPrint {
    public static void main(String[] args) {
        /*
        Write a program to input a 2D array of size m×n and print it in matrix format.

         */

        System.out.println("Enter the size of the matrix :");
        System.out.println("rows:");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("cols:");
        int cols = sc.nextInt();
        int arr[] [] = new int[rows][cols];
        System.out.println("Enter the matrix:");
        for(int i=0; i<rows;i++){
            for(int j=0; j<cols;j++){
                 arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing the matrix:");
        for(int i=0; i<rows;i++){
            int sum=0;
            for(int j=0; j<cols;j++){
                System.out.print(arr[i][j]+" ");
                sum+=arr[i][j];
            }
            System.out.print(sum);
            System.out.println();
        }
    }
}
