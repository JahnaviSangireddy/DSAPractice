package com.dsapractice.codesignalIntro;

public class StrictlyIncreasingSequence {
    /*
    Given a sequence of integers as an array, determine whether it is possible
    to obtain a strictly increasing sequence by removing no more than one
    element from the array.

    For sequence = [1, 3, 2, 1], the output should be solution(sequence) = false.

    There is no one element in this array that can be removed in order to get a
    strictly increasing sequence.

    For sequence = [1, 3, 2], the output should be solution(sequence) = true.

    You can remove 3 from the array to get the strictly increasing sequence [1, 2].
    Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].
     */
    public static void main(String[] args) {
        int arr[] = {1, 3, 2};
        boolean b = checkIfIncreasingSequence(arr);
        System.out.println(b);

    }

    private static boolean checkIfIncreasingSequence(int[] arr) {
        int count=0;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                continue;
            }else{
                count++;
            }
            if(count>1)
                return false;
        }
        return true;
    }
}
