package Math.Number;

public class BinaryToDecimal {
    public static void main(String[] args) {
         String s ="1111";
        System.out.println(binaryToD(s));
        System.out.println(bToD(s));
    }

    // brut force
    public static int binaryToD(String s)
    {
        int decimal =0;
        int n = s.length();
        for(int i=s.length()-1;i>=0;i--)
        {
          int c = Integer.parseUnsignedInt(""+s.charAt(i));
          decimal+= c * Math.pow(2,(n-i-1));
        }
        return decimal;
    }
// using inbuild functions
    public static int bToD(String s) {

        return Integer.parseInt(s,2);
    }
    }



