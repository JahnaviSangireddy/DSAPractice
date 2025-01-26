package com.dsapractice.testques;

public class CountOfNumbersThatAreNotEqualToAGivenNum
{
    public static void main(String[] args) {
        /*
         find count of all numbers that are not equal to numbers [0] or numbers [1] of a integer array
         */
        int[] numbers = {4, 3, 2, 3, 2, 5, 4, 3};
        int count = countOfNumbersNotEqual(numbers);
        System.out.println(count);
    }

    private static int countOfNumbersNotEqual(int[] numbers) {
        int count=0;
        for(int i : numbers){
            if(i!=numbers[0] && i!=numbers[1]){
                count++;
            }
        }
        return count;
    }
}
