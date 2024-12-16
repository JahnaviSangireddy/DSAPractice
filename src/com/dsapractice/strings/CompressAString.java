package com.dsapractice.strings;

public class CompressAString {
    public static void main(String[] args) {
       char chars[] = {'a','a','b','b','b','b','b','b','b','b','b','b','b','b'};
       int compressdStringLength = compressChars(chars);
        System.out.println(compressdStringLength);
    }

    private static int compressChars(char[] chars) {

        int i=0;
        int write=0;
        while(i<chars.length){
            char currchar = chars[i];
            int count=0;
            while(i<chars.length && chars[i] == currchar){
                count++; i++;
            }
            chars[write++] = currchar;
            if(count>1){
                for(char c : Integer.toString(count).toCharArray()){
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}
