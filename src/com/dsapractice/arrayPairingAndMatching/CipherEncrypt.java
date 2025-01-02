package com.dsapractice.arrayPairingAndMatching;

public class CipherEncrypt {
    public static void main(String[] args) {
        /*
        input="middle-Outz" k=2
        output="okffng-Qwvb"
        convert each char=> char+k => m->o
         */
        String str = "There's-a-starman-waiting-in-the-sky"; int k=3;
        String output = encryptUsingCipher(str,k);
        System.out.println(output);
    }

    private static String encryptUsingCipher(String str, int k) {
        char arr[] = str.toCharArray();
        for(int i=0; i<arr.length; i++){
            char c = arr[i];
            if(Character.isLowerCase(c)){
                arr[i] = (char) ((c - 'a' + k) % 26 + 'a');
            }else if(Character.isUpperCase(c)){
                arr[i] = (char) ((c - 'A' + k) % 26 + 'A');
            }else {
                continue;
            }
        }
        return new String(arr);
    }
}
