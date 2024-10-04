package Math.Number;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UnwantedChar {


        // Function to read arrays with multi-digit numbers
        public static List<Integer> input1() {
            List<Integer> arr = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            String inp = scanner.nextLine();

            // Remove unwanted characters like '[', ']', '(', ')' and ','
            inp = inp.replaceAll("[\\[\\]\\(\\),]", " ");

            Scanner ss = new Scanner(inp);
            while (ss.hasNextInt()) {
                int num = ss.nextInt();
                arr.add(num);
            }

            return arr;
        }

        // Function to read arrays with single-digit numbers
        public static List<Integer> input2() {
            List<Integer> arr = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            for (char c : input.toCharArray()) {
                if (Character.isDigit(c)) {
                    arr.add(Character.getNumericValue(c));
                }
            }

            return arr;
        }

        public static void main(String[] args) {
            List<Integer> arr = input1();

            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
