package Problems;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class MaximumInSubarrayK {



    public static ArrayList<Integer>  maxInSubarray(int n, int k,int[] arr)
    {
      ArrayList<Integer> list  = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i =0;i<arr.length;i++)
        {

            // if  index at front is out of our window of size k then poll the front index from deque
            if(!dq.isEmpty() && dq.peek()==i-k) dq.poll();
            // delete the last index from the deque till the  arr[dq.peekLast()]<= arr[i]
            while(!dq.isEmpty() && arr[dq.peekLast()]<= arr[i])
            {
                dq.pollLast();
            }

            dq.offer(i);


            // this condition is used for the window covers the fist 3 indexes;
            if(i>=k-1)
            {
                list.add(arr[dq.peek()]);
            }

        }
        return list;

    }


    public static void main(String[] args) {
        int n=9;
        int k =3;
        int[] arr = {1 ,2 ,3 ,1 ,4 ,5 ,2 ,3 ,6};
        System.out.println( maxInSubarray(n, k,arr));

    }
}
