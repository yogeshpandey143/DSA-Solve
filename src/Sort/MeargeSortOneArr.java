package Sort;

import java.util.ArrayList;

public class MeargeSortOneArr {



    public static void main (String[] args) {
        int[] arr = {4,8,2,5,1,6,3,7};
        devide(arr ,0 ,arr.length-1);

        for(int val:arr)
        {
            System.out.println(val);
        }

    }


    public static void devide(int[] arr , int low , int high)
    {
        if(low>=high) return;

        int mid = (high+low)/2;

        devide(arr,low,mid);
        devide(arr,mid+1,high);
        merge(arr,low,high,mid);
    }

    public static void merge(int[] arr, int low ,int high, int mid)
    {


        ArrayList<Integer> newarr = new ArrayList<>();


        int left = low;
        int right = mid+1;



        while(left<=mid && right<=high)
        {

            if(arr[left]<= arr[right])
            {
                newarr.add(arr[left]);
                left++;

            }
            else{
                newarr.add(arr[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            newarr.add(arr[left]);
            left++;
        }

        while(right<=high)
        {
            newarr.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = newarr.get(i - low);
        }}
}
