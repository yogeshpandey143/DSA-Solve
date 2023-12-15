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

            int minIdx = i;
            for (int j = i+1; j < arr.length;j++){

                if(arr[j]<arr[minIdx])
                {
                    minIdx=j;
                }

            }
            if(minIdx!=i)
            swap(arr,i,minIdx);
        }
    }

    private static void swap(int[] arr ,int i1, int i2 ) {

        int temp=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }
}
