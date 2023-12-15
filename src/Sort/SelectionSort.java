package Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {3,5,2,4,8};


        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {

        for(int i=0;i<arr.length;i++) {

            int minIdx = i; // taking index of 1st
            for (int j = i+1; j < arr.length;j++){

                if(arr[j]<arr[minIdx])  // checking whether arr[j]<arr[minIdx] while it not get it actual location
                {
                    minIdx=j;
                }
            }
            if(minIdx!=i)      // if minimus index is not equalls to i then swap
            swap(arr,i,minIdx);
        }
    }

    private static void swap(int[] arr ,int i1, int i2 ) {

        int temp=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }
}




