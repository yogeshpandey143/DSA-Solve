package Sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr= {3,5,2,7,1,5};
        quick(arr ,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    public static void quick(int[] arr , int low ,int high)
    {
        if(low<high) {

            int pIndex = partition(arr, low, high);

            quick(arr, low, pIndex - 1);
            quick(arr, pIndex + 1, high);
        }

    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[low];
        int i=low;
        int j=high;

        while(i<j)
        {
            while(arr[i]<=pivot && i<high)
            {
                i++;
            }
            while( arr[j]>pivot && j>low)
            {
                j--;
            }
            if(i<j) swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
