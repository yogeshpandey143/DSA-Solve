package Recursion.striver;

public class RecursiveCall {

    public void printName(int n)
    {
        if(n==0) return;

        System.out.println("Yogesh Pandey");

        printName(n-1);
    }


    public  void printNumber(int n)
    {
       if(n<1) return;
        printNumber(n-1);
        System.out.println(n);
    }


    public  void printNumberLast(int n)
    {
        if(n==0) return;
        System.out.println(n);
        printNumberLast(n-1);
    }





    public static void main(String[] args) {

        RecursiveCall rc = new RecursiveCall();
        rc.printNumber(5);


    }
}
