package StringBuilder;

import java.util.Arrays;

public class Methods {


    public static void main(String[] args) {
        String name = "Yogesh Pandey";

        // change string into array
        System.out.println(Arrays.toString(name.toCharArray()));


        // lower case
        System.out.println(name.toLowerCase());

        //  give idex of character
        System.out.println(name.indexOf('a'));

        System.out.println(name.trim());

        System.out.println(name.substring(1));

    }

}
