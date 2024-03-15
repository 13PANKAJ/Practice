import java.util.*;
import java.util.stream.Collectors;

public class A {

    //list of stri




    public static void main(String[] args) {

        List<String> name = new ArrayList<>();

        name.add("pankaj");
        name.add("deep");
        name.add("akash");
        name.add("pradeep");
        name.add("malvi");

        name.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        System.out.println("=====================");
     List<String > reverese=   name.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
       // String highestExperience = EmployeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).
        //        findFirst().get().getName();
        System.out.println(reverese);
        System.out.println(name.toString());






    }
}
