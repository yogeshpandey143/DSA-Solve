package revisionProblem;

public class TrappingWater {

    public  static int maxWater(int arr[]) {
        // code here
        int n = arr.length, maxl =arr[0] ,maxr=arr[n-1];
        int[] left = new int[n];
        int[] right = new int[n];
        int sum =0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>maxl)
            {
                maxl= arr[i];
            }
            left[i]= maxl;

            if(arr[n-i-1]>maxr)
            {
                maxr= arr[n-i-1];
            }
            right[n-i-1]= maxr;
        }

        for(int i=0;i<n;i++)
        {
            int minh= Math.min(left[i],right[i]);
            sum+= minh-arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arr ={1,2,3,4};
        maxWater(arr)
        System.out.println(maxWater(arr));
    }
}
