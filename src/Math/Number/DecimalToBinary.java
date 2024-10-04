package Math.Number;


public class DecimalToBinary {
    public static void main(String[] args) {
        int n =4;
        System.out.println(dToB(n));
    }
    private static String dToB(int n) {
        String s ="";
        while(n!=1)
        {
           int rem = n%2;
           s+=rem;
           n=n/2;
        }
        s+=n;
        String str="";
        for(int i = s.length()-1;i>=0;i--)
        {
            str+=s.charAt(i);

        }
        return  str;
    }
}
