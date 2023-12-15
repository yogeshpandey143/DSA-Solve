package Sort;


import java.util.*;
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr= {3,5,2,4,8};


        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
            }
        }
    }

    private static void swap(int[] arr ,int i1, int i2 ) {

        int temp=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }


}
