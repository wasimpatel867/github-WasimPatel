package StreamsAPIInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"Amit","IT",30),
                new Employee(2,"Neha","HR",29),
                new Employee(3,"Rahul","IT",28),
                new Employee(3,"Priya","HR",26),
                new Employee(4,"Sachin","Finance",30)
        );
        Map<String, List<Employee>> result =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()
                                                .sorted(Comparator.comparingInt(Employee::getAge))
                                                .collect(Collectors.toList())
                                )
                        ));
        result.forEach((dept, empList) -> {
            System.out.println(dept);
            empList.forEach(e ->
                    System.out.println("  " + e.getName() + " - " + e.getAge()));
        });
        /*Map<String,List<Employee>> result = employees.stream().sorted(Comparator.comparingInt(Employee::getAge))
                 .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(result);*/
    }
}
