package com.dsapractice.recursion;

public class CheckIfStringIsPalindrome {
    public static void main(String[] args) {
        //rotator, noon, deed, malayalam
        String s= "rotator";
        char ch[] = s.toCharArray();
        int i=0; int j=ch.length-1;

        reverseString(ch, i, j);
        String reversedString = new String(ch);
        if (s.equals(reversedString)) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

    private static void reverseString(char[] ch, int i, int j) {
        if(i>=j){
            return;
        }
        char t = ch[i];
        ch[i] = ch[j];
        ch[j] = t;
        reverseString(ch,i+1,j-1);
    }

}
