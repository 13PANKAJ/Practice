import java.util.*;
import java.util.stream.Collectors;

public class Employee {
        int id;
        String name;
        int age;
        String gender;
        String department;
        int yearOfJoining;
        double salary;

        public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
        {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.department = department;
            this.yearOfJoining = yearOfJoining;
            this.salary = salary;
        }
        public int getId()
        {
            return id;
        }
        public String getName()
        {
            return name;
        }
        public int getAge()
        {
            return age;
        }
        public String getGender()
        {
            return gender;
        }
        public String getDepartment()
        {
            return department;
        }
        public int getYearOfJoining()
        {
            return yearOfJoining;
        }
        public double getSalary()
        {
            return salary;
        }
        @Override
        public String toString()
        {
            return "Id : "+id
                    +", Name : "+name
                    +", age : "+age
                    +", Gender : "+gender
                    +", Department : "+department
                    +", Year Of Joining : "+yearOfJoining
                    +", Salary : "+salary;
        }

        public static void main(String[] args) {
            List<Employee> EmployeeList = new ArrayList<Employee>();

            EmployeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
            EmployeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
            EmployeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
            EmployeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
            EmployeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
            EmployeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
            EmployeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
            EmployeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
            EmployeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
            EmployeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
            EmployeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
            EmployeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
            EmployeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
            EmployeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
            EmployeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
            EmployeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
            EmployeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

         String highestExperience = EmployeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).
                  findFirst().get().getName();
            System.out.println("highest exp"+highestExperience);


            Map<String, List<Employee>> name2 = EmployeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

            Map<String,List<Employee>> empByDept = EmployeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

            System.out.println("printing emp count from each dept");
            EmployeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
                    .entrySet().forEach(System.out::println);

            /*empByDept.forEach((dept,emplist)->{
                            System.out.println("printing emp  dept:"+dept);
                           emplist.forEach(e-> System.out.println("name of emp:"+e.getName()));
            }
            );*/



           /*  //count male and female in list
              EmployeeList.stream().
              collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
              .entrySet().forEach(System.out::println);

              //print all dept from organisation
           *//* EmployeeList.stream().map(Employee::getDepartment).
            distinct().forEach(System.out::println);*//*

            //avg age of male and female
           *//* System.out.println("printing avg age of male and female");
            EmployeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)))
                    .entrySet().forEach(System.out::println);*//*

            //names of emp who joined after 2015
          *//*  System.out.println("GETTING NAME WHO JOINED AFTER 2015");
            EmployeeList.stream().filter(e->e.getYearOfJoining()>2015).map(e->e.getName()).forEach(System.out::println);
*//*

            //count emp in each dept
            System.out.println("count emp in each dept");
            EmployeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
                    .entrySet().forEach(System.out::println);

*/
          //Find out the average and total salary of the organization
         /*   DoubleSummaryStatistics empSalary = EmployeeList.stream()
                    .collect(Collectors
                            .summarizingDouble(Employee::getSalary));

            System.out.println("Average Salary = "+empSalary.getAverage());
            System.out.println("Total Salary = "+empSalary.getSum());*/

          //  Find out the oldest employee, his/her age and department?

            Optional<Employee> oldestEmp = EmployeeList.stream().max(Comparator.comparingInt(Employee::getAge));
            Employee oldestEmployee = oldestEmp .get();

            System.out.println("Name : "+oldestEmployee.getName());
            System.out.println("Age : "+oldestEmployee.getAge());
            System.out.println("Department : "+oldestEmployee.getDepartment());
            String s = "pankaj";

            s.chars().mapToObj(c->(char)c).sorted(Collections.reverseOrder()).forEach(System.out::println);


        }
        }





    

