package Search;

public class BinarySearch {


    public static void main(String[] args) {
        int[] arr ={3,4,2,7,1,6};
        System.out.println(binarySearch(arr,0, arr.length-1,7));
    }

    public static int binarySearch(int[] arr,int start,int end,int target)
    {
        int mid=(start+end)/2;

        while(start<end)
        {


            if(arr[mid]==target){
               return mid;
            }
            else if(arr[mid]<target)
            {
                start =mid+1;

            }
            else end = mid-1;
        }
        return -1;
    }
}
