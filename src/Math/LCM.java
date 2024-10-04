package Math;

public class LCM {

    public static void main(String[] args) {
        int n1=35,n2=45;
        System.out.println(lcm(n1,n2));
    }


    public static int lcm(int n1 , int n2)
    {
        int gcd =0;
        for(int i=1;i<=Math.min(n1,n2);i++)
        {
          if(n1%i==0 && n2%i==0) gcd=i;

        }
        return (n1*n2)/gcd;//  since lcm = product of numbers/gcd
    }
}
