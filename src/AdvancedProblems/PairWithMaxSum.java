package AdvancedProblems;

public class PairWithMaxSum {

    public static void main(String[] args) {
       //Given an array arr[] of size n, the task is to find the maximum sum of
        // the smallest and second smallest elements among all possible subarrays of size greater than equals to two.

   int arr[] = {4,3,1,5,6};
   System.out.println(maxSumPair(arr));

    }
    public  static int maxSumPair(int[] arr)
    {
        int n = arr.length;
        if(n<2) return -1;
        int res = arr[0]+arr[1];

        for(int i =1;i<arr.length-1;i++)
        {
            res = Math.max(res , arr[i]+arr[i+1]);
        }
        return res;
    }
}


//Input : arr[] = [4, 3, 1, 5, 6]
//Output : 11
//Subarrays with smallest and second smallest are,
//Subarray: [4, 3], smallest = 3, second smallest = 4, sum = 7
//Subarray: [4, 3, 1], smallest = 1, second smallest = 3, sum = 4
//Subarray: [4, 3, 1, 5], smallest = 1, second smallest = 3, sum = 4
//Subarray: [4, 3, 1, 5, 6], smallest = 1, second smallest = 3, sum = 4
//Subarray: [3, 1], smallest = 1, second smallest = 3, sum = 4
//Subarray: [3, 1, 5], smallest = 1, second smallest = 3, sum = 4
//Subarray: [3, 1, 5, 6], smallest = 1, second smallest = 3, sum = 4
//Subarray: [1, 5], smallest = 1, second smallest = 5, sum = 6
//Subarray: [1, 5, 6] ,smallest = 1, second smallest = 5, sum = 6
//Subarray: [5, 6], smallest = 5, second smallest = 6, sum = 11
//Maximum sum among all above choices is, 5 + 6 = 11