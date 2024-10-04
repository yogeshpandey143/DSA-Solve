package TCS;

import java.util.Scanner;

public class TotalDearrangements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //calculating DeArrangements

        System.out.println(tdr(5));
//        int[] dp=new int[N+1];
//        dp[0]=1;
//        dp[1]=0;
//
//        for(int i=2; i<N+1; i++){
//            dp[i]=(i-1) * (dp[i-1]+dp[i-2]);
//        }
//
//        System.out.println(dp[N]);
    }

    private static int tdr(int n){
        if(n==0) return 1;
        if(n==1) return 0;

        return (n-1) * (tdr(n-1)+tdr(n-2));
    }
}