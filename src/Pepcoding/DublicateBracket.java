package Pepcoding;

import java.util.Stack;

public class DublicateBracket {

    public static boolean dublicateBracket(String str){

        Stack<Character> st  = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch==')'){
                if(st.peek()=='(')
                {
                    return true;
                }
                else{
                    while(st.peek()!='(' )st.pop();
                }
             }
            else{
                st.push(ch);

            }
        }
        return false;
    }


    public static void main(String[] args) {
        String str = "(a+b)+(c+d)";

        System.out.println( dublicateBracket( str));

    }
}
