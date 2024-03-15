import java.util.*;
import java.util.stream.Collectors;

class MaxSalary1 {
    private String department;
    private double salary;

    public MaxSalary1(String department, double salary) {
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "MaxSalary{" +
                "department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class MaxSalary {
    public static void main(String[] args) {
        List<MaxSalary1> MaxSalarys = Arrays.asList(
                new MaxSalary1("HR", 55000.0),
                new MaxSalary1("IT", 60000.0),
                new MaxSalary1("HR", 60000.0),
                new MaxSalary1("IT", 62000.0),
                new MaxSalary1("Finance", 58000.0)
        );

       // Map<String, Optional<MaxSalary1>> maxSalariesByDepartment =
        MaxSalarys.stream()
                .collect(Collectors.groupingBy(
                        MaxSalary1::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(MaxSalary1::getSalary))
                )).entrySet().forEach(System.out::println);



//        maxSalariesByDepartment.forEach((department, MaxSalary) -> {
//            System.out.println("Department: " + department);
//            System.out.println("Max Salary: " + MaxSalary.orElse(null));
//        });
    }
}
