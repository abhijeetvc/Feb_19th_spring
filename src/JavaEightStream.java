import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaEightStream {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("India","US","France","Germany");
        //Operations: a) Intermediate operations, b) Terminal operations

     //   list.forEach(str-> System.out.println(str));

//        List<String> newList=list.stream()
//                .filter(str->!"Germany".equals(str))  // Intermediate operation
//                .collect(Collectors.toList());

        // Transformation
        List<String> newData=list.stream()
                .map(s-> s.toUpperCase())  // Intermediate operation
                .sorted()
                .collect(Collectors.toList());

     //   System.out.println(newData);

        List<Employee> empList=new ArrayList<>();

        empList.add(new Employee(1,"A","Pune"));
        empList.add(new Employee(2,"B","Mumbai"));
        empList.add(new Employee(3,"C","Chennai"));

        List<String> names=empList.stream()
                .map(employee->employee.getName())
                .collect(Collectors.toList());

        System.out.println("Employee names: "+names);

    }
}

class Employee{

    private Integer id;
    private String name;
    private String city;

    public Employee(Integer id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}