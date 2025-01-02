package com.dsapractice.codesignalIntro;

import static java.lang.Math.max;

public class ElectionWinners {
    public static void main(String[] args) {
        /*
        Problem
    --------------------------------------------------------------------------------
    Elections are in progress!

    Given an array of the numbers of votes given to each of the candidates so
    far, and an integer k equal to the number of voters who haven't cast their
    vote yet, find the number of candidates who still have a chance to win the
    election.

    The winner of the election must secure strictly more votes than any other
    candidate. If two or more candidates receive the same (maximum) number of
    votes, assume there is no winner at all.

    Example

    For votes = [2, 3, 5, 2] and k = 3, the output should be
    solution(votes, k) = 2.
         */
        int votes[] = {5, 1, 3, 4};
        int k=0;
        int majority = findNoOfCandidatesThatMayWinWithKVotes(votes,k);
        System.out.println(majority);
    }

    private static int findNoOfCandidatesThatMayWinWithKVotes(int[] votes, int k) {
        int count=0;
        int maxelm =0;

        for(int i=0; i< votes.length-1;i++){
            maxelm = max(votes[i],votes[i+1]);
        }
        for(int i=0; i< votes.length;i++){
            if(votes[i]+k > maxelm){
                count++;
            }
        }
        return count;
    }
}
