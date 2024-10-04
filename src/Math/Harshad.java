package Math;

public class Harshad {

    //  3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.

    public static void main(String[] args) {
        int num = 379;
        harshad( num);
    }

    public static  void harshad(int num)
    {
        int sum =0;
        int temp = num;
        while(temp>0)
        {
          int rem = temp%10;
          sum+=rem;
          temp= temp/10;

        }
       if(num%sum==0) System.out.println("harshad");
       else System.out.println("not harshad");
    }
}
