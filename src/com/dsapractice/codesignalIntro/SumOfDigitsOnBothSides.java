package com.dsapractice.codesignalIntro;

public class SumOfDigitsOnBothSides {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Ticket numbers usually consist of an even number of digits. A ticket number
    is considered lucky if the sum of the first half of the digits is equal to
    the sum of the second half.

    Given a ticket number n, determine if it's lucky or not.

    Example

    For n = 1230, the output should be solution(n) = true.
    For n = 239017, the output should be solution(n) = false.
         */
        String ticketNum="239017";
        boolean b= isTicketLucky(ticketNum);
        System.out.println(b);
    }

    private static boolean isTicketLucky(String ticketNum) {

        int n = ticketNum.length();
        String firsthalf = ticketNum.substring(0,n/2);
        System.out.println(firsthalf);
        String sechalf = ticketNum.substring(n/2);
        System.out.println(sechalf);
        int n1 = Integer.parseInt(firsthalf);
        int sum1=0;
        while(n1>0){
          int  d =n1%10;
          sum1 = sum1+d;
            n1 = n1/10;
        }

        int n2 = Integer.parseInt(sechalf);
        int sum2=0;
        while(n2>0){
            int  d =n2%10;
            sum2 = sum2+d;
            n2 = n2/10;
        }
        if(sum1 == sum2){
            return true;
        }else{
            return false;
        }

    }
}
