package com.dsapractice.testques;

import java.util.*;

public class SortAStringBasedOnCriteria {
    /*
    Given a string of words. sort the words based on the diff between noofvowels, noof consonants
    If theey are same sort based on length
     */
    public static void main(String[] args) {
        String str="apple orange banana mango kiwi grape";
        String words[] = str.split(" ");
        String sortedWords[] = sortByDiffInVowelCons(words);
        for(String word : sortedWords){
            System.out.println(word);
        }
        Arrays.sort(sortedWords,Comparator.comparing(String :: length)
                .thenComparing(String :: compareTo));

        System.out.println("***************************");

        for(String word : sortedWords){
            System.out.println(word);
        }

     //   Arrays.sort(words, Comparator.comparingInt(SortAStringBasedOnCriteria :: getDiffVowelAndConsonat)
     //           .thenComparing(String :: length)
     //           .thenComparing(String :: compareTo));

      //  for(String s : words){
        //    System.out.println(s);
        //}
    }

    private static String[] sortByDiffInVowelCons(String[] words) {
        Map<String,Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        for(String s : words){
            int diff = getDiffVowelAndConsonat(s);
            map.put(s,diff);
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1,e2)->e1.getValue() - e2.getValue());
        for(Map.Entry<String,Integer> entry : list){
            res.add(entry.getKey());
        }
        return res.toArray(new String[0]);
    }

    private static int getDiffVowelAndConsonat(String word) {
        int vow=0,con=0;
        char ch[] = word.toLowerCase().toCharArray();
        for(char c: ch){
            if("aeiou".indexOf(c)!=-1){
                vow++;
            }else if(Character.isLetter(c)){
                con++;
            }
        }
        return vow-con;

    }
}
