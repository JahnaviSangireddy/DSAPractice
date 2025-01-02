package com.dsapractice.codesignalIntro;

public class CheckValidTime {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Check if the given string is a correct time representation of the 24-hour
    clock.

    Example

    For time = "13:58", the output should be solution(time) = true;
    For time = "25:51", the output should be solution(time) = false;
    For time = "02:76", the output should be solution(time) = false.
         */

        String time="12:16";
        boolean isvalidTime = checkValidTime(time);
        System.out.println(isvalidTime);
    }

    private static boolean checkValidTime(String time) {
        String arr[] = time.split(":");
        int hours = Integer.parseInt(arr[0]);
        int mins = Integer.parseInt(arr[1]);
        if(hours <=23 && mins <=59){
            return true;
        }
        return false;
    }
}
