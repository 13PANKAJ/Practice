import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ElementFrequencyUsingStreams {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 2, 3, 4);

        // Using Java 8 streams to count the frequency of elements
        Map<Integer, Long> frequencyMap = integerList.stream()
                .collect(Collectors.toMap(
                        e -> e, // Key mapper (identity function)
                        e -> 1L, // Value mapper (always 1 for counting)
                        Long::sum // Merge function (summing up occurrences)
                ));

        // Print the frequency of each element
       /* frequencyMap.forEach((element, frequency) -> {
            System.out.println("Element: " + element + ", Frequency: " + frequency);
        });*/

    frequencyMap.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);
    }

}

