/*
import java.util.*;
import java.util.stream.Collectors;

class StreamsAvg {
 
        private String name;
        private String department;
        private double salary;

        public StreamsAvg(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }
    }

    public class StreamsAvgGrouping {
        public static void main(String[] args) {
            List<StreamsAvg> StreamsAvgGroupings = new ArrayList<>();
            StreamsAvgGroupings.add(new StreamsAvg("Alice", "HR", 50000));
            StreamsAvgGroupings.add(new StreamsAvg("Bob", "IT", 60000));
            StreamsAvgGroupings.add(new StreamsAvg("Charlie", "HR", 99000));
            StreamsAvgGroupings.add(new StreamsAvg("David", "IT", 65000));
            StreamsAvgGroupings.add(new StreamsAvg("Eve", "Finance", 70000));
            StreamsAvgGroupings.add(new StreamsAvg("Frank", "Finance", 72000));


            HashMap<String,Double> h = StreamsAvgGroupings.stream().sorted(Comparator
                    .comparing(StreamsAvg::getSalary)) // sorting is based on TagId 55,44,33,22,11
                    .collect(Collectors.toMap
                            (StreamsAvg::getDepartment, StreamsAvg::getSalary,
                                    (oldValue, newValue) -> oldValue,LinkedHashMap::new));


                    //sort(Comparator.comparing(StreamsAvg::getSalary).reversed()).collect

            System.out.println(h.entrySet());

          //max salary by each dept
            //
            System.out.println("==========================");
            Map<String, Optional<StreamsAvg>> maxSalDeptWise=  StreamsAvgGroupings.stream().
                    collect(Collectors.groupingBy(StreamsAvg::getDepartment,
                            Collectors.maxBy(Comparator.comparingDouble(StreamsAvg::getSalary))));

            maxSalDeptWise.forEach((dept,salary) -> {
                System.out.println("dept:" + dept);
                System.out.println("salary:" + salary);
            });

            System.out.println("==========================");
            // Calculate average salary by department
        */
/*    Map<String, Double> averageSalaryByDepartment = StreamsAvgGroupings.stream()
                    .collect(Collectors.groupingBy(
                            StreamsAvg::getDepartment, // Group by department
                            Collectors.averagingDouble(StreamsAvg::getSalary) // Calculate average salary
                    ));*//*

           */
/* Map<String, Double> averageSalaryByDepartment = StreamsAvgGroupings.stream().collect(Collectors.groupingBy(StreamsAvg::getDepartment,Collectors.averagingDouble(StreamsAvg::getSalary)));
            // Print the result
            averageSalaryByDepartment.forEach((department, averageSalary) -> {
                System.out.println("Department: " + department + ", Average Salary: " + averageSalary);
            });*//*


            Set<Integer> findDup= new HashSet<>();
            List<Integer> l1 = Arrays.asList(1,2,3,4,5,653,234,6,6,2,5,5,3,75,3,98,9,0);
            List<String> sL= Arrays.asList("pankaj","malvi","pankaj","billionare","rocsks");
            sL.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
            //print even no
         // -> l1.stream().filter(i->i%2==0).peek(e->System.out.print("printing even no ")).forEach(System.out::println);
            //print starts with in integer array
           //-> l1.stream().map(s->s+"").filter(i->i.startsWith("6")).forEach(System.out::println);

            //find duplicate in integer String
            //->l1.stream().filter(u->!findDup.add(u)).forEach(System.out::println);

            //find first element
            //->l1.stream().findFirst().ifPresent(System.out::println);


            //count of element present
           //->int n = (int) l1.stream().count();
            //System.out.println(n);

            Optional<Integer> max =l1.stream().max(Integer::compare);
          //  System.out.println(max);
          //->  sL.stream().sorted(Comparator.comparing(s -> s.toString()).reversed()).forEach(System.out::println);

               */
/* Stream<Character> c = sL.stream().flatMap(s->s.chars().mapToObj(e->(char)e));
               Character nonRepeatedFirst = c.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                        .entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst().get();
            System.out.println(nonRepeatedFirst);*//*

            String s = "pankaj";
           */
/* s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                    .entrySet().stream().filter(e->e.getValue()==2).map(e->e.getKey()).forEach(System.out::println);*//*


           */
/* s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream()
                    .filter(e->e.getValue()==1).map(e->e.getKey()).forEach(System.out::println);*//*


            //first repeated character from string
     */
/*       char firstrepeat = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()))
                    .entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).findFirst().get();
            System.out.println("first repeated char"+firstrepeat);*//*


            //print each character count
*/
/*
            s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()))
                    .entrySet().forEach(System.out::println);
*//*


            //print duplicate words in string
      */
/*      sL.stream().collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()))
                    .entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).forEach(System.out::println);*//*




         */
/*   Map<String, Long> wordCounts = words.stream()
                    .collect(Collectors.groupingBy(
                            String::toLowerCase, // Ignore case while comparing words
                            Collectors.counting()
                    ));*//*


            System.out.println("Duplicate Words:");
            wordCounts.entrySet().stream()
                    .filter(entry -> entry.getValue() > 1)
                    .forEach(entry -> System.out.println(entry.getKey()));
        //sort integer array
            //l1.stream().sorted().forEach(System.out::println);
       //sort integer array decending
            //l1.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
          //  sL.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);






        }
    }



*/
