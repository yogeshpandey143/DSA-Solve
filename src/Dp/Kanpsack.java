package Dp;

public class Kanpsack {



    // Each value is associated with the same index weight
    // {
    // 2-15
    // 5-14
    // 1-10
    // 3-45
    // 4-30
    // }
    public static void main(String[] args) {
        int[] weight = { 2,5,1,3,4};
        int[] value = {15,14,10,45,30};
        int sum =7;
        int n = weight.length;
        int dp[][]= new int[n+1][sum+1];


        for(int i =0;i<dp.length;i++)
        {
            for(int j =0;j<dp[0].length;j++)
            {
               if(j>=weight[i-1])
               {
                   int rweight = j- weight[i-1];
               }
            }
        }

    }



}
