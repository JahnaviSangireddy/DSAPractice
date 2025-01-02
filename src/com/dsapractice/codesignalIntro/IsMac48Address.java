package com.dsapractice.codesignalIntro;

public class IsMac48Address {
    public static void main(String[] args) {
        /*
          Problem
    --------------------------------------------------------------------------------
    A media access control address (MAC address) is a unique identifier assigned
    to network interfaces for communications on the physical network segment.

    The standard (IEEE 802) format for printing MAC-48 addresses in
    human-friendly form is six groups of two hexadecimal digits (0 to 9 or
    A to F), separated by hyphens (e.g. 01-23-45-67-89-AB).

    Your task is to check by given string inputString whether it corresponds to
    MAC-48 address or not.

    Example

    For inputString = "00-1B-63-84-45-E6", the output should be
    solution(inputString) = true;

    For inputString = "Z1-1B-63-84-45-E6", the output should be
    solution(inputString) = false;

    For inputString = "not a MAC-48 address", the output should be
    solution(inputString) = false.
         */
        String address="00-1B-63-84-45-E6";
        boolean isValid = checkIsValidAddress(address);
        System.out.println(isValid);
    }

    private static boolean checkIsValidAddress(String address) {
        String arr[] = address.split("-");
        boolean isvalid= true;
        if(arr.length != 6){
            System.out.println("--");
            isvalid=false;
        }
        for(String s : arr){
            if(s.length() != 2){
                System.out.println("**");
                isvalid=false;
            }
            for(char c: s.toCharArray()){
                c = Character.toLowerCase(c);
                if(!((c>='0' && c<='9') || (c>='a' && c<='f'))){
                    isvalid=false;
                }
            }
        }
        return isvalid;
    }
}
