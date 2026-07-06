package StreamsAPIInterview;

public class Employee {
    private int id;
    private String name;
    private String department;
    private int age;

    public Employee(int id, String name, String department, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }
}
