package com.dsapractice.arrayPairingAndMatching;

public class ValidPassword {
    /*
    Check if password is valid and return no of missing characters
        Its length is at least 6.
        It contains at least one digit.
        It contains at least one lowercase English character.
        It contains at least one uppercase English character.
        It contains at least one special character.
        The special characters are: !@#$%^&*()-+
     */
    public static void main(String[] args) {
        String pass="2bbbb";
        int c = findNoOfMissingChars(pass);
        System.out.println(c);
    }

    private static int findNoOfMissingChars(String pass) {

        String spchars="!@#$%^&*()-+";
       boolean hasUpcase = false;
       boolean hasLocase = false;
       boolean hasDigit = false;
       boolean hasSpchars = false;

       for(char c : pass.toCharArray()){
           if(Character.isUpperCase(c)){
               hasUpcase = true;
           }else if(Character.isLowerCase(c)){
               hasLocase = true;
           }else if(Character.isDigit(c)){
               hasDigit = true;
           }else if(spchars.contains(c+"")){
               hasSpchars = true;
           }
       }
       int missingCat =0;
       if(!hasUpcase)
           missingCat++;
       if(!hasLocase)
           missingCat++;
       if(!hasDigit)
           missingCat++;
       if(!hasSpchars)
           missingCat++;
       int lendiff = 6 - pass.length();
       int c = Math.max(lendiff, missingCat);
       return c;
    }
}
