package Math;

public class Factorial {
    public static void main(String[] args) {
        int n=3;
        System.out.println(fact(n));
    }
    public static int fact(int n) {
          if(n==1 ||n==0) return 1;

          return n*fact(n-1);
    }
}
