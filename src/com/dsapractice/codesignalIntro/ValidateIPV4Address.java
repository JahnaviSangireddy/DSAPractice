package com.dsapractice.codesignalIntro;

public class ValidateIPV4Address {
    public static void main(String[] args) {
        /*
        Problem
    --------------------------------------------------------------------------------
    An IP address is a numerical label assigned to each device (e.g., computer,
    printer) participating in a computer network that uses the Internet Protocol
    for communication. There are two versions of the Internet protocol, and thus
    two versions of addresses. One of them is the IPv4 address.

    Given a string, find out if it satisfies the IPv4 address naming rules.

    Example

    For inputString = "172.16.254.1", the output should be
    solution(inputString) = true;

    For inputString = "172.316.254.1", the output should be
    solution(inputString) = false.
    316 is not in range [0, 255].

    For inputString = ".254.255.0", the output should be
    solution(inputString) = false.
    There is no first number.
         */
        String inpstr ="172.16.254.1";
        boolean b = validateIPV4Address(inpstr);
        System.out.println(b);
    }

    private static boolean validateIPV4Address(String inpstr) {
        boolean valid = false;
        String arr[] = inpstr.split("\\.");
        for(String s : arr){
            if (!s.equals("")) {
                int i = Integer.parseInt(s);
                System.out.println(i);
                if(!(i >= 0 && i<=255)){
                   return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
