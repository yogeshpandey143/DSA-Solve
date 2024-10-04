package Math.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {2,6,3,4,1,9};
        int n= arr.length;
        insertionSort(arr ,n);
        System.out.println(Arrays.toString(arr));
    }


    public static void insertionSort(int[] arr , int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1]) swap(arr ,j ,j-1);
            }

        }
    }

    public static void  swap(int[] arr ,int i , int j)
    {
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
}
