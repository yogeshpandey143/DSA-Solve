package revisionProblem;
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
import java.util.Arrays;

public class ProductExceptSelf {


    public static int[] productExceptSelf(int[] nums) {


        int[] res = new int[nums.length];
        int count=0;
        int prod =1;

        for(int num:nums)
        {
            if(num==0)
            {
                count++;
            }
            else prod*=num;
        }


        for(int i=0;i<nums.length;i++)
        {
            if(count>1)
            {
                res[i]=0;
            }
            else if(count==1)
            {
                if(nums[i]==0) res[i]=prod;
                else res[i]=0;
            }
            else res[i]= prod/nums[i];
        }

        return res;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
      int[] res=  productExceptSelf(nums);
        System.out.println(Arrays.toString(res));
    }
}
