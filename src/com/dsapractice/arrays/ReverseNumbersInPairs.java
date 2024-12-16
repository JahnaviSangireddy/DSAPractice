package com.dsapractice.arrays;

public class ReverseNumbersInPairs {
    public static void main(String[] args) {
        /*
        input[] = {1, 5, 7, 3, 2, 1}
        output[] ={1, 5, 3, 7, 1, 2}
         */
        int input[] ={1, 5, 7, 3, 2, 1};
        int input2[] = {6, 7, 8, 8, 5, 3, 2};
        int output [] = reversePairs(input2);
        for(int i : output){
            System.out.println(i);
        }
    }

    private static int[] reversePairs(int[] input) {
        for(int i=0; i< input.length-1;i=i+2){
            if(input[i] > input[i+1]){
                int t= input[i];
                input[i] = input[i+1];
                input[i+1] = t;
            }
        }
        return input;
    }
}
