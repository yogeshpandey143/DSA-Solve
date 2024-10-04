package Math.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
          int arr[]={3,2,6,21,7,2};
          int n = arr.length;
        selectionSort(arr,n);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr, int n)
    {
        for(int i=0;i<n;i++)
        {
            int min = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min]) min=j;
            }
            if(min!=i)
            swap(arr,i,min);
        }


    }
    public static void swap(int[] arr ,int i ,int j){
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }

}
