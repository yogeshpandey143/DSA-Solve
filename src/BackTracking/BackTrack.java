package BackTracking;

public class BackTrack {

    public static void main(String[] args) {

        int[] arr = {2,1,1,7,3};
        int dub=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            dub=dub^arr[i];
        }

        System.out.println(dub);
    }
}
