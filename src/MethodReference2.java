//d) Reference to constructor

interface MyInterface{
    MyDemo2 check(String s);
}

class MyDemo2{

    public MyDemo2(String message){
        System.out.println(message);
    }
}

interface MyInterface2{
    void check1();
}

public class MethodReference2 {

    public static void main(String[] args) {
        MyInterface my=MyDemo2::new;
        my.check("Hello");

    }
}

// Implementation of the comparator interface using java 8