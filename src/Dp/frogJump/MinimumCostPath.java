package Dp.frogJump;

public class MinimumCostPath {

    public static void main(String[] args) {
        int n =3;
        int m =3;
        int[][] arr={{1,3,7,},{5,9,2},{6,3,2}};
       int [][] dp =new int[n][m];

       for(int i=dp.length-1;i>=0;i--)
       {
           for(int j = dp.length-1;j>=0;j--)
           {

               // if we are last index of 2d matrix then path can be that index itself
               if(i==dp.length-1 && j==dp[0].length-1) {
                   dp[i][j] = arr[i][j];
               }
               //if we are on last row then the minimum path can be only toward next column
               else if(i==dp.length-1 )
               {
                   dp[i][j]=dp[i][j+1] +arr[i][j];
               }
               //if we are on last column then the minimum path can be only toward next row
               else if(j==dp[0].length-1)
               {
                   dp[i][j]=dp[i+1][j] +arr[i][j];
               }
               // else  the path that is minimum in row or column we store that path
               else{
                   dp[i][j]=Math.min(dp[i][j+1],dp[i+1][j]) +arr[i][j];
               }
           }
       }

        System.out.println(dp[0][0]);
    }
}
