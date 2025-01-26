package com.dsapractice.testques;

public class CountOfNumsDivBy3 {
    /*
   Given array of integers as Strings, return the count of numbers that are
   divisible by three and has exactly 2 ‘7’s in it.

     */
    public static void main(String[] args) {
        String arr[] = {"99","27","2772"};
        int count= sol(arr);
        System.out.println(count);
    }

    private static int sol(String[] arr) {
        int totcount=0;
        for(String s : arr){
            char ch[] = s.toCharArray();
            int count=0;
            for(char c : ch){
                if(c == '7'){
                    count++;
                }
            }
            int num = Integer.parseInt(s);
            if(count == 2 && num%3 == 0){
                totcount++;
            }
        }
        return totcount;
    }
}
