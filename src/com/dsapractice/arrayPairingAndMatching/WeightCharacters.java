package com.dsapractice.arrayPairingAndMatching;

import java.util.*;

public class WeightCharacters {
    public static void main(String[] args) {
        /*
        for each char there is a weight (a-1, b-2, c-3 ...)
        if there are 2as-> 2, id 2bs->4...
        input="abccddde"
        given an arr[1, 3, 12, 5, 9, 10] return arr with yes or no if the weights exists in the string

        for the given string weights will be 1, 2, 6, 12, 5
        ouput-> [yes,no,yes,yes,no,no]
         */
        String s = "abbcccddddeef";
        printAllUniformSubSequences(s);
     //  int arr[] = {1, 3, 12, 5, 9, 10};
       List<Integer> queries = new ArrayList<>(Arrays.asList(1,3,12,5,9,10));
    //    printAllUniformSubSequences(s);
     //   List<Integer> subseqweights = findSubSequenceWeights(s);
        List<String> res = weightedUniformStrings(s,queries);
        for(String rs: res){
            System.out.print(rs+", ");
        }
    }

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        List<Integer> subseqweights = findSubSequenceWeights(s);
        List<String> res = checkWeights(queries,subseqweights);
        return res;
    }

    private static List<String> checkWeights(List<Integer> arr, List<Integer> subseqweights) {
        List<String> res = new ArrayList<>();
        for(int i=0; i<arr.size(); i++){
            if(subseqweights.contains(arr.get(i))){
                res.add("Yes");
            }else{
                res.add("No");
            }
        }
        return res;
    }

    private static List<Integer> findSubSequenceWeights(String s) {
        Map<Character,Integer> countmap = new HashMap<>();
        for(char c: s.toCharArray()){
            countmap.put(c,countmap.getOrDefault(c,0)+1);
        }
        List<String> subseqlist = new ArrayList<>();
        List<Integer> subseqweights = new ArrayList<>();
        for(Map.Entry<Character,Integer> entry : countmap.entrySet()){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<entry.getValue();i++){
                sb.append(entry.getKey());
                subseqlist.add(sb.toString());
            }
        }
        for(String str : subseqlist){
            int weight = (int) ((str.charAt(0) -96)*str.length());
            subseqweights.add(weight);
        }
        return subseqweights;
    }


    private static void printAllUniformSubSequences(String s) {
        Map<Character,Integer> countmap = new HashMap<>();
        for(char c: s.toCharArray()){
            countmap.put(c,countmap.getOrDefault(c,0)+1);
        }
        List<String> subseqlist = new ArrayList<>();
        List<Integer> subseqweights = new ArrayList<>();
        for(Map.Entry<Character,Integer> entry : countmap.entrySet()){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<entry.getValue();i++){
                sb.append(entry.getKey());
                subseqlist.add(sb.toString());
            }
        }
        for(String str : subseqlist){
            int weight = (int) ((str.charAt(0) -96)*str.length());
            System.out.println(str+" : "+weight);

            subseqweights.add(weight);
        }
    }
}
