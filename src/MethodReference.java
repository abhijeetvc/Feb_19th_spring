//4 kinds of method references
//a) Reference to static method
//b) Reference to an instance method
//c) Reference to an instance method of arbitrary object of particular type
//d) Reference to constructor

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("India","US","France","Germany");
      //  list.forEach(Demo1::display);
      //  list.forEach(str->Demo1.display(str));

        Demo1 d1=new Demo1();
        list.forEach(d1::display1);
    }
}

class Demo1{
    public static void display(String str){
        System.out.println(str);
    }

    public void display1(String str){
        System.out.println(str);
    }
}