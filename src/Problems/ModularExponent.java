package Problems;

// ******** asked in google *************
public class ModularExponent {



    private static long helper(long x, long n, long m){
        if(n == 0){
            return 1;
        }
        if(n%2 == 0){
            return (helper( (x*x)%m ,n/2,m))%m;  // for even x^n -> (x^2)^n/2;
        }
        else{
            return (x*helper( (x*x)%m ,n/2,m))%m;  //for odd x^n -> x*(x^2)^n/2;
        }
    }
    public static long powMod(long x, long n, long m)
    {
        if(x == 0 || x == 1 || n==1) return x%m;
        if(n == 0) return 1%m;
        return helper(x,n,m) % m;
    }

    public static void main(String[] args) {
        long x =4, n=3 ;
         long m= 5;

        System.out.println( powMod( x,  n, m));

    }
}
