package StreamsAPIInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;


    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Employee(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public int getId() {
    return id;}
 }
  /*  List<Employee> result = employees.stream()
            .filter(e -> "Male".equalsIgnoreCase(e.getGender()))
            .filter(e -> e.getAge() > 35)
            .collect(Collectors.toList());
    result



}
*/