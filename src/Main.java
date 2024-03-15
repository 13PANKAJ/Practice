import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sam", "Samantha", "John", "Steve", "Susan");

        long distinctCharCount = names.stream()
                .filter(name -> name.startsWith("S")).distinct().
                flatMap(name -> Arrays.stream(name.split("")))
                .count();
         // Split each name into characters


        System.out.println("Distinct characters count in names starting with 'S': " + distinctCharCount);
    }
}

