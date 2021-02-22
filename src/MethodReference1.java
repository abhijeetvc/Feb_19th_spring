//c) Reference to an instance method of arbitrary object of particular type

import java.util.Arrays;

public class MethodReference1 {

    public static void main(String[] args) {
        String[] myArray={"Apple","orange","banana","Grapes"};
        String s1="Apple";

        Arrays.sort(myArray,String::compareToIgnoreCase);
        for(String s:myArray){
            System.out.println(s);
        }
    }
}
