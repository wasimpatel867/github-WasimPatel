package StreamsExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestSalaryByDept {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 60000),
                new Employee("Bob", "IT", 75000),
                new Employee("Charlie", "HR", 55000),
                new Employee("David", "HR", 65000),
                new Employee("Eve", "Finance", 70000)
        );

        // Approach 1: Using collectingAndThen to unwrap Optional (Recommended)
        Map<String, Employee> highestSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartments,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                optional -> optional.orElse(null)
                        )
                ));

        highestSalaryByDept.forEach((department, employee) -> {
            if (employee != null) {
                System.out.println(department + " -> " + employee.getNames() + " : " + employee.getSalary());
            }
        });

        // Approach 2: Using Optional directly (if you prefer Optional)
        System.out.println("\n--- Alternative Approach with Optional ---");
        Map<String, java.util.Optional<Employee>> highestSalaryByDeptOptional = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartments,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));

        highestSalaryByDeptOptional.forEach((department, employee) ->
                employee.ifPresent(emp -> System.out.println(department + " -> " + emp.getNames() + " : " + emp.getSalary()))
        );
    }
}

