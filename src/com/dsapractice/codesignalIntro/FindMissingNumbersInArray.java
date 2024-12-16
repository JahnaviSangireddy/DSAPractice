package com.dsapractice.codesignalIntro;

import java.util.Arrays;

public class FindMissingNumbersInArray {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Ratiorg got statues of different sizes as a present from CodeMaster for his
    birthday, each statue having an non-negative integer size. Since he likes to
    make things perfect, he wants to arrange them from smallest to largest so that
    each statue will be bigger than the previous one exactly by 1. He may need some
    additional statues to be able to accomplish that. Help him figure out the
    minimum number of additional statues needed.

    Example

    For statues = [6, 2, 3, 8], the output should be solution(statues) = 3.

    Ratiorg needs statues of sizes 4, 5 and 7.

         */

        int arr[] = {6, 2, 3, 8};
        int count = findMissingNumsCount(arr);
        System.out.println(count);
    }

    private static int findMissingNumsCount(int[] arr) {
        Arrays.sort(arr); //2 3 6 8
        int expectedCount = arr[arr.length-1] - arr[0]+1;
        int actualCount = arr.length;
        return expectedCount - actualCount;
    }
}
