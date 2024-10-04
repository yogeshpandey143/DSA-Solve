package Math;

public class GCD {
    public static void main(String[] args) {
        int n1 = 23;
        int n2 =20;
        System.out.println(gcd(n1 ,n2));


    }
    public static int gcd(int n1 ,int n2)
    {
       int gn = Math.max(n1,n2);
       int sn = Math.min(n1,n2);
       while(gn%sn!=0)
       {
           int rem = gn%sn;
           gn = sn ;
           sn = rem ;

       }

       return sn;
    }
}
