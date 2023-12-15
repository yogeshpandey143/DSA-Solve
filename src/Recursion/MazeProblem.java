package Recursion;

public class MazeProblem {

    public static void main(String[] args) {
        System.out.println( count(3,3));

        path("",3,3);
    }

    private static void path(String s, int r, int c) {
        if(r==1 && c==1)
        {
            System.out.println(s);
            return;
        }
        if(r>1) {
            path(s + "D", r - 1, c);
        }
        if(r>1 && c>1)
        {
            path(s + "Dia", r - 1, c-1);
        }
        if(c>1) {
            path(s + "R", r, c - 1);
        }

    }




    public static int  count(int r ,int c)
    {
        if(r==1||c==1)
        {
            return 1;

        }
        int left =count(r-1,c);
        int right = count(r,c-1);
        return left+right;
    }


}
