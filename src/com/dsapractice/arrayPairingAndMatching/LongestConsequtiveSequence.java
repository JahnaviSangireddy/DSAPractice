package com.dsapractice.arrayPairingAndMatching;

import java.util.Arrays;
import java.util.Map;

public class LongestConsequtiveSequence {
    public static void main(String[] args) {
        /*
        **Longest Consecutive Sequence**
    - Find the length of the longest consecutive sequence in an unsorted array.
    - Example: `Input: [100, 4, 200, 1, 3, 2]` → `Output: 4` (`[1, 2, 3, 4]`)

         */
        int input[] = {100, 4, 200, 1, 3, 2, 201, 202, 203, 204};
        int maxlongestConsecSeq = findLongestConseSeq(input);
        System.out.println(maxlongestConsecSeq);
    }

    private static int findLongestConseSeq(int[] input) {
        Arrays.sort(input);
       int maxlen = Integer.MIN_VALUE;
        int seqlen=1;
        for(int i=1; i<input.length; i++){
            if(input[i] - input[i-1] == 1){
                seqlen++;
            }else{
                maxlen = Math.max(seqlen,maxlen);
                seqlen = 1;
            }
        }
        return Math.max(seqlen,maxlen);
    }
}
