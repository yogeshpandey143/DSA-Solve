package Recursion;

public class PathWithRiver {
    public static void main(String[] args) {
boolean[][] board ={
        {true,true,true},
        {true,false,true},
        {true,true,true}
};
        pathWithRock("",board, 0, 0);
    }

    private static void pathWithRock(String s,boolean[][] board, int r, int c) {
        if(r==board.length-1 && c==board[0].length-1)
        {
            System.out.println(s);
            return;
        }

        if(board[r][c]==false)
        {
         return;
        }

        if (r<board.length-1) {
            pathWithRock(s + "D",board, r +1, c);
        }

        if (c<board[0].length-1) {
            pathWithRock(s + "R",board, r, c + 1);
        }



    }
}
