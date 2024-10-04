package Math.Number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {
        int[] arr = input().stream().mapToInt(i->i).toArray();


     for(int e :arr)
     {
         System.out.println(e);
     }

    }


    public static List<Integer> input() {
        List<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
         input = input.replaceAll("//[//]//,","");
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                arr.add(Character.getNumericValue(c));
            }
        }

        return arr;
    }
}
