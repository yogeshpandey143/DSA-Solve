package Dp.frogJump;

public class FrogJumpRec {


    public static void main(String[] args) {
        int[] arr ={10,20,30,50,30,40};
        int n = arr.length;
        System.out.println( frogJump(arr ,n-1));
    }

    public static int frogJump(int[] arr ,int idx)
    {
        if(idx==0) return 0;


        // when frog jumps 1 step
        int left = frogJump(arr,idx-1) + Math.abs(arr[idx]-arr[idx-1]);
        int right=  Integer.MAX_VALUE;
        if(idx>1)
        {
            // when frog jumps 2 steps
           right= frogJump(arr,idx-2) + Math.abs(arr[idx]-arr[idx-2]);
        }


        return Math.min(left,right);
    }
}
