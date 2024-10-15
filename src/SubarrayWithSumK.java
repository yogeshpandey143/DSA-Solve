import java.util.HashMap;

public class SubarrayWithSumK {


    public static void main(String[] args) {

 int arr[] ={2,3,4,2,5,1,-1,-2};
 int tar =5;
        System.out.println(subArraySum(arr, tar));
    }
    static int subArraySum(int arr[], int tar) {
        // add your code here
        HashMap<Integer, Integer> sumFrequency = new HashMap<>();
        int presum = 0;
        int count = 0;

        sumFrequency.put(0, 1);

        for (int num : arr) {
            presum += num;

            if (sumFrequency.containsKey(presum - tar)) {
                count += sumFrequency.get(presum - tar);
            }

            sumFrequency.put(presum, sumFrequency.getOrDefault(presum, 0) + 1);
        }

        return count;
    }

}
