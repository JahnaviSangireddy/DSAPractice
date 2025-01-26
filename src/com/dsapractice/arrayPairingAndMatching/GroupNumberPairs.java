package com.dsapractice.arrayPairingAndMatching;

import java.util.*;

public class GroupNumberPairs {
    public static void main(String[] args) {
        /*
        count the no of pairs where one num can to transformed to another by swaping at most 2 nums

         */
        int arr[] = {123, 132, 213, 231, 312, 321, 456, 465};
        int count = noOfPairs(arr);
        System.out.println(count);
    }

    private static int noOfPairs(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int num : arr) {
            String s= num+"";
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String sortednum = new String(ch);
            int snum = Integer.parseInt(sortednum);
            if(map.containsKey(snum)){
                map.get(snum).add(num);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(num);
                map.put(snum,list);
            }
        }
        map.forEach((k,v)-> System.out.println(k+":"+v));
        int count=0;
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){
            for(int i : entry.getValue()){
                if(entry.getKey() != i){
                    count++;
                }
            }
        }
        return count;
    }
}
