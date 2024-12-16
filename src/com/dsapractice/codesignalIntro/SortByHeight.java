package com.dsapractice.codesignalIntro;

public class SortByHeight {
    public static void main(String[] args) {
        /*
          Problem
    --------------------------------------------------------------------------------
    Some people are standing in a row in a park. There are trees between them
    which cannot be moved. Your task is to rearrange the people by their heights
    in a non-descending order without moving the trees. People can be very tall!

    Example

    For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
    solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
         */

        int arr[] = {-1, 150, 190, 170, -1, -1, 160, 180,100};
        int outarr[] = getsolution(arr);
        for(int i: outarr){
            System.out.print(i+" ");
        }
    }

    private static int[] getsolution(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == -1){
                continue;
            }else{
                for(int j=i+1; j< arr.length;j++){
                    if(arr[j] ==-1){
                        continue;
                    }else{
                        if(arr[i] > arr[j]){
                            int t=arr[i];
                            arr[i]= arr[j];
                            arr[j]=t;
                        }
                    }
                }
            }
        }
        return arr;
    }
}
