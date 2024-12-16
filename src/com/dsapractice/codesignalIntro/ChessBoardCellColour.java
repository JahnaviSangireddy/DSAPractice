package com.dsapractice.codesignalIntro;

public class ChessBoardCellColour {
    public static void main(String[] args) {
        /*
         Problem
    --------------------------------------------------------------------------------
    Given two cells on the standard chess board, determine whether they have the
    same color or not.

      +---+---+---+---+---+---+---+---+
    8 |   |###|   |###|   |###|   |###|
      |---|---|---|---|---|---|---|---|
    7 |###|   |###|   |###|   |###|   |
      |---|---|---|---|---|---|---|---|
    6 |   |###|   |###|   |###|   |###|
      |---|---|---|---|---|---|---|---|
    5 |###|   |###|   |###|   |###|   |
      |---|---|---|---|---|---|---|---|
    4 |   |###|   |###|   |###|   |###|
      |---|---|---|---|---|---|---|---|
    3 |###|   |###|   |###|   |###|   |
      |---|---|---|---|---|---|---|---|
    2 |   |###|   |###|   |###|   |###|
      |---|---|---|---|---|---|---|---|
    1 |###|   |###|   |###|   |###|   |
      +---+---+---+---+---+---+---+---+
        A   B   C   D   E   F   G   H

    Example

    For cell1 = "A1" and cell2 = "C3", the output should be
    solution(cell1, cell2) = true.
         */
        String cell1="A4";
        String cell2="D5";
        boolean b = checkIfBothcellsHavesameColor(cell1,cell2);
        System.out.println(b);
    }

    private static boolean checkIfBothcellsHavesameColor(String cell1, String cell2) {
        char c1 = cell1.charAt(0);
        int idx1 = c1 - 96;
        int s1 = cell1.charAt(1);

        char c2 = cell2.charAt(0);
        int idx2 = c2 - 96;
        int s2 = cell2.charAt(1);

        if((idx1%2 ==0 && s1%2==0) && (idx2%2==0 && s2%2==0)){
            return true;
        }else if((idx1%2 !=0 && s1%2!=0) && (idx2%2!=0 && s2%2!=0)){
            return true;
        }else if((idx1%2 ==0 && s1%2!=0) && (idx2%2==0 && s2%2!=0)){
            return true;
        }else if((idx1%2 !=0 && s1%2==0) && (idx2%2!=0 && s2%2==0)){
            return true;
        }else if((idx1%2 ==0 && s1%2!=0) && (idx2%2!=0 && s2%2==0)){
        return true;
        }else if((idx1%2 !=0 && s1%2==0) && (idx2%2==0 && s2%2!=0)){
        return true;
        }
        return false;
    }
}
