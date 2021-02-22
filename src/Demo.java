import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

//interface Rbi{
//    void withDraw();
//    void deposit();
//}
//
//class Sbi implements Rbi{
//
//    @Override
//    public void withDraw() {
//       //
//    }
//
//    @Override
//    public void deposit() {
//      //
//    }
//
//    public void fD(){
//        //
//    }
//
//    public static void main(String[] args) {
//        Rbi s=new Sbi();
//    }
//}
interface DemoInterface{
    Integer calculateLength(String str);
}

public class Demo implements DemoInterface{

    public static void main(String[] args) {

        List<String> values= Arrays.asList("a","c","d","e","b");

        List<String> newValues=
                values.stream().map(val->val.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

     //   System.out.println(newValues);

        Function<String,String> func=str->str.toUpperCase();
        String i=func.apply("Abhi");
        System.out.println("Length: "+i);

        BiFunction<Integer,Integer,Integer> func1=(a,b)->a+b;
        Integer i1=func1.apply(10,20);
        System.out.println("Addition of nos: "+i1);

        Demo d=new Demo();
      //  d.calculateLength("Abc");
    }

    @Override
    public Integer calculateLength(String str) {
        return str.length();
    }
}
