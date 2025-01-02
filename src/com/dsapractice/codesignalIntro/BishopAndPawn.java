package com.dsapractice.codesignalIntro;

public class BishopAndPawn {
    public static void main(String[] args) {
        String bishopPos="A7";
        String pawnPos = "E3";
        boolean canMove = canBishopMoveToPawnInOneStep(bishopPos, pawnPos);
        System.out.println(canMove);
    }

    private static boolean canBishopMoveToPawnInOneStep(String bishopPos, String pawnPos) {
        boolean canMove =false;
        /*
        Files
        The vertical columns on the chessboard, labeled a through h from left to right.
        The a- through d-files are the queenside, and the e- through h-files are the kingside.
        Ranks
        The horizontal rows on the chessboard, numbered 1 through 8 from bottom to top.
        The 1st through 4th ranks are White's side, and the 5th through 8th ranks are Black's side.

         Each square on the chessboard is identified by a unique coordinate pair of a file letter and rank number.
         For example, the initial square of White's king is designated as "e1"
         */

        int file1= (int) bishopPos.charAt(0) - 64;
        int rank1 = bishopPos.charAt(1);

        int file2 = (int) pawnPos.charAt(0)-64;
        int rank2 = pawnPos.charAt(1);
        System.out.println(file1+" , "+file2);
        if(Math.abs(file1 - file2) == Math.abs(rank1-rank2)){
            canMove=true;
        }else {
            canMove=false;
        }
        return canMove;
    }
}
