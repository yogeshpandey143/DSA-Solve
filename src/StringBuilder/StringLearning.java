package StringBuilder;

public class StringLearning {


    public static void main(String[] args) {
        String str1="yogi";
        String str2="yogi";


        if(str1==str2) System.out.println("true");
        else System.out.println("false");


        // == checks the value as well as the variable;
        String name1 = new String("Yogesh");
        String name2  = new String("Yogesh");
        if(name1==(name2)) System.out.println("true");
        else System.out.println("false");


        // .equals() checks the value not  variable;
        if(name1.equals(name2)) System.out.println("true");
        else System.out.println("false");


        // mrthods in String


        // to get the character at specific index;  str.charAt(index)
        System.out.println(name1.charAt(0));



    }

}
