package StreamsExample;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestSalaryByDept {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 60000),
                new Employee("Bob", "IT", 75000),
                new Employee("Charlie", "HR", 55000),
                new Employee("David", "HR", 65000),
                new Employee("Eve", "finance", 70000)
        );

        List<String> highestpaid = employees.stream()
                .filter(emp -> emp.getSalary() > 75000)
                .map(Employee::getNames)
                .toList();
        System.out.println("Employees with salary greater than 60000: " + highestpaid);
        /*Map<String, Optional<Employee>> highestSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartments,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));

        highestSalaryByDept.forEach((department, employee) ->

          System.out.println(department+ " -> " + employee.get().getNames() + " : " + employee.get().getSalary()));
    }*/
    }
}
