import java.util.*;

import java.util.stream.Collectors;

public class frequency {


    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 1, 2, 4};
        Arrays.stream(integers).collect(Collectors.groupingBy(e->e, Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);
    }

        //duplicate//Integer[] integers = {1, 2, 3, 4, 5, 6, 1, 2, 4};
        //        findDuplicateElements(integers);


}
