package com.dsapractice.strings;

public class LicenseKeyFormating {
    public static void main(String[] args) {
        /*
        You are given a license key represented as a string s that consists of only alphanumeric characters and dashes. The string is separated into n + 1 groups by n dashes. You are also given an integer k.

We want to reformat the string s such that each group contains exactly k characters, except for the first group, which could be shorter than k but still must contain at least one character. Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.

Return the reformatted license key.

Input: s = "5F3Z-2e-9-w", k = 4
Output: "5F3Z-2E9W"
Explanation: The string s has been split into two parts, each part has 4 characters.
Note that the two extra dashes are not needed and can be removed.
         */

       // String s="5F3Z-2e-9-w"; int k=4;
        String s="2-5g-3-J"; int k=2;
        String formatedstr = formatLicense(s,k);
        System.out.println(formatedstr);
    }

    private static String formatLicense(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String s1 = s.replaceAll("-","").toUpperCase();
        System.out.println(s1);
        int c=0;
        for(int i=s1.length()-1; i>=0; i--){
            sb.insert(0,s1.charAt(i));
            c++;
            if(c==k) {
                sb.insert(0, "-");
                c = 0;
            }
        }
        String ss= sb.toString();
        if(ss.startsWith("-")){
            ss = ss.replaceFirst("-","");
        }
        return ss;
    }
}
