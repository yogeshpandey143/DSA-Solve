package Sort;
import java.util.*;
public class MergeSort {


    public static void main(String[] args) {
  int[] arr= {2,5,1,8,4};


        System.out.println(Arrays.toString(  devide(arr)));
    }

    private static  int[] devide(int[] arr )
    {
        if(arr.length==1) return arr;
       int mid = arr.length/2;


       int[] left = devide(Arrays.copyOfRange(arr,0,mid));
       int[] right = devide(Arrays.copyOfRange(arr,mid,arr.length));

      return   conqure(left,right);

    }

    private static int[] conqure(int[] left ,int[] right)
    {

        int[] ans = new int[left.length+right.length];
     int i=0,j=0,k=0;
    while(i<left.length && j<right.length)
    {
        if(left[i]<=right[j])
        {
            ans[k++]=left[i++];
        }
        else{
            ans[k++]=right[j++];
        }
    }

        while(i<left.length){
            ans[k++]=left[i++];
        }
        while(j<right.length){
            ans[k++]=right[j++];
        }

  return ans;
    }

}
