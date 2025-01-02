package com.dsapractice.codesignalIntro;

public class FileNaming {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    You are given an array of strings names representing filenames. The array
    is sorted in order of file creation, such that names[i] represents the name
    of a file created before names[i+1] and after names[i-1] (assume 0-based
    indexing). Because all files must have unique names, files created later
    with the same name as a file created earlier should have an additional (k)
    suffix in their names, where k is the smallest positive integer (starting
    from 1) that does not appear in previous file names.

    Your task is to iterate through all elements of names (from left to right)
    and update all filenames based on the above. Return an array of proper
    filenames.

    Example

    For names = ["doc", "doc", "image", "doc(1)", "doc"], the output should be
    solution(names) = ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"].
         */

        String inputarr[] = {"doc", "doc", "image", "doc(1)", "doc"};
        String outputarr[] = renameduplicateFiles(inputarr);
        for(String s : outputarr){
            System.out.println(s);
        }
    }

    private static String[] renameduplicateFiles(String[] inputarr) {
        for(int i=0; i<inputarr.length; i++){
            String chk = inputarr[i];
            int count=1;
            for(int j=i+1; j<inputarr.length;j++){
                if(chk.equals(inputarr[j])){
                    String t=inputarr[j];
                    t= t+"("+count+++")";
                    inputarr[j] = t;
                }
            }
        }
        return inputarr;
    }
}
