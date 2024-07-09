package Dp.frogJump;

public class FrogJumpMemo {
    public static void main(String[] args) {
        int[] arr ={10,20,30,50,30,40};
        int n = arr.length;
        int[] dp = new int[n+1];
        for(int i=0;i<dp.length;i++) dp[i]=-1;
        System.out.println( frogJump(arr ,n-1 ,dp));
        System.out.println(frogJumpTabu( arr));
    }
    public static int frogJump(int[] arr ,int idx,int[] dp)
    {
        if(idx==0) return 0;

       if(dp[idx]!=-1) return dp[idx];

           // when frog jumps 1 step
           int left = frogJump(arr, idx - 1, dp) + Math.abs(arr[idx] - arr[idx - 1]);
           int right = Integer.MAX_VALUE;
           if (idx > 1) {
               // when frog jumps 2 steps
               right = frogJump(arr, idx - 2, dp) + Math.abs(arr[idx] - arr[idx - 2]);
           }
        return dp[idx]=Math.min(left,right);
    }





    // tabulation
    public static int frogJumpTabu(int[] arr)
    {
       int prev =0;
       int prev2 =0;
        for(int i =1;i<arr.length;i++) {

            // when frog jumps 1 step
            int left = prev + Math.abs(arr[i] - arr[i - 1]);
            int right = Integer.MAX_VALUE;
            if (i > 1) {
                // when frog jumps 2 steps
                right = prev2 + Math.abs(arr[i] - arr[i - 2]);
            }

            int curr=Math.min( left ,right);

            prev2 = prev;
            prev=curr;
        }
       return prev;
    }
}
