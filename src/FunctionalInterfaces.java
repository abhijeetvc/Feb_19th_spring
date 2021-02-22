import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class FunctionalInterfaces {

    public static void main(String[] args) {

        Function<String,Integer> f1=str->str.length();
        Integer i=f1.apply("Abhi");
        System.out.println("Length of string: "+i);

        BiFunction<Integer,Integer,Integer> f2=(a,b)->a+b;
        Integer i2=f2.apply(20,30);
        System.out.println("Addition is: "+i2);

        BinaryOperator<Integer> f3=(a,b)->a+b;
        Integer i3=f3.apply(40,50);
        System.out.println("Addition result: "+i3);

        //Function chaining
        Function<String,Integer> f4=str->str.length();
        Function<Integer,Integer> f5=val->val*10;
        Integer i4=f4.andThen(f5).apply("Abcd");
        System.out.println("Result: "+i4);

        //Unary operator
        UnaryOperator<Integer> f6=a->a+10;
        Integer i5=f6.apply(20);
        System.out.println("Unary op. result: "+i5);

        List<String> countries= Arrays.asList("India","US","France","China","Japan");
        List<String> newCountries=countries.stream()
                    .filter(str->!"China".equals(str))
                    .collect(Collectors.toList());
        System.out.println(newCountries);

        List<Integer> values=Arrays.asList(10,5,15,20,25,30);
        Predicate<Integer> p=x->x>10;
        List<Integer> newValues=values.stream()
                        .filter(p)
                        .collect(Collectors.toList());
        System.out.println("New Values: "+newValues);

        //Bi-Predicate
        BiPredicate<String,Integer> f7=(str,val)->{
          return str.length()==val;
        };
        boolean flag=f7.test("Abhi",4);
        System.out.println("Flag is: "+flag);

        //Consumer
        Consumer<Integer> c=val-> System.out.println(val);
        c.accept(10);

        BiConsumer<Integer,Integer> bi=(a,b)-> System.out.println(a+b);
        bi.accept(30,40);

        List<String> colors=Arrays.asList("Red","Green","Violet","Yellow");
       // colors.forEach(color-> System.out.println(color));
        //method reference
        colors.forEach(System.out::println);
    }
}
