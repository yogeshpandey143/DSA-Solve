package Subset;



//permutation by iteration
public class Permutation {


    public static void main(String[] args) {

        String str ="abc";

        permutation("",str);

    }

    private static void  permutation(String nstr ,String str)
    {
        if(str.isEmpty())
            System.out.println(str);


        char ch = str.charAt(0);


        for(int i=0;i<str.length();i++) {

            String first = str.substring(0, i);
            String second = str.substring(i, str.length());
            permutation(first + ch + second, str.substring(1));
        }

    }


}
