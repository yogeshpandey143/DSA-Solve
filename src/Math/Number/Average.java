package Math.Number;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        final int totalDays = 7;
         int[] duration = new int[totalDays];
         int total =0;
         double averageDuration;

         Scanner sc = new Scanner(System.in);
         for(int i=0;i<totalDays;i++)
         {
             System.out.println("Day " + (i+1) +" exercise duration: ");
             duration[i]=sc.nextInt();
             total+=duration[i];
         }

         averageDuration = total/7.0;
        System.out.println("Total duratin: "+total);
        averageDuration=Math.round(averageDuration*100.0)/100.0;
        System.out.println("Average: "+ averageDuration );
    }
}
