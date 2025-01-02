package com.dsapractice.arrayPairingAndMatching;

public class CheckStringInString {
    public static void main(String[] args) {
        /*
        Given message="SOS";
        this message is sent many times but sometimes it is corrupted. return how many times it is corrupted.
        input ="SOSSPSSQSSOR";
        output = 3
        (SOS)(SPS)(SQS)(SOR)
               -    -     -
         */

        String str = "SOSSPSSQSSOR";
        int corrptimes= findCountOfCoruptTimes(str);
        System.out.println(corrptimes);
    }

    private static int findCountOfCoruptTimes(String str) {
        String message = "SOS";
        StringBuilder sb = new StringBuilder();
        int noOfMesg = str.length()/3;
        for(int i=0; i<noOfMesg; i++){
            sb.append(message);
        }
        int corupTimes = 0;
        for(int j=0; j<str.length(); j++){
            if(str.charAt(j)!= sb.charAt(j)){
                corupTimes++;
            }
        }
        return corupTimes;
    }
}
