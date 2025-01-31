package com.dsapractice.codesignalIntro;

public class AlternatingSums {
    public static void main(String[] args) {
        /*
         Several people are standing in a row and need to be divided into two teams.
    The first person goes into team 1, the second goes into team 2, the third
    goes into team 1 again, the fourth into team 2, and so on.

    You are given an array of positive integers - the weights of the people.
    Return an array of two integers, where the first element is the total
    weight of team 1, and the second element is the total weight of team 2
    after the division is complete.

    Example

    For a = [50, 60, 60, 45, 70], the output should be
    solution(a) = [180, 105].
         */
        int arr[] = {50, 60, 60, 45, 70};
        int outputarr[] = alternatesums(arr);
        System.out.print(outputarr[0]+" "+outputarr[1]);
    }

    private static int[] alternatesums(int[] arr) {
        int asum=0, bsum=0;
        for(int i=0; i<arr.length; i++){
            if(i%2 == 0){
                asum = asum+arr[i];
            }else{
                bsum = bsum+arr[i];
            }
        }
        return new int[]{asum,bsum};
    }
}
