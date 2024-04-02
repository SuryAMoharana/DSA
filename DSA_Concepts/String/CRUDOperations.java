package String;

import java.util.Arrays;

public class CRUDOperations {
    public static void main(String[] args) {
        String str1="abs";
        String str2="def";

        //concatenation
        //System.out.println(str1+str2);

        //content comparison
        //System.out.println(str1.equals(str2));

        //lexicographical comparison
        //System.out.println(str2.compareTo(str1));

        //searching
        System.out.println(str1.indexOf("a"));
        System.out.println(str1.contains("ab"));


        //split in array
        String[] strArr=str1.split("");
        System.out.println(Arrays.toString(strArr));


    }
}
