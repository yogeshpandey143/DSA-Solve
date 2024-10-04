package SieveOfErothones;

public class Prime {

    public static void main(String[] args) {
        int n=7;
        System.out.println(prime(n));


    }

    public static boolean prime(int n )
    {
      boolean arr[] = new boolean[n+1];

        for (int p = 2; p * p <= n; p++) {

            if (arr[p] == false) {

                for (int i = p * p; i <= n; i += p)
                    arr[i] = true;
            }
        }
        if(arr[n]==true) return false;
        return true;
    }
}
