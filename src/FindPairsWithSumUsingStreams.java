/*
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class FindPairsWithSumUsingStreams {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int targetSum = 7;

        Set<String> pairs = new HashSet<>();

        Arrays.stream(array)
                .forEach(num1 -> {
                    int num2 = targetSum - num1;
                    if (IntStream.of(array).anyMatch(x -> x == num2)) {
                        // Ensure that we don't add duplicate pairs in different orders (e.g., 3 + 4 and 4 + 3)
                        String pair = num1 <= num2 ? num1 + " + " + num2 : num2 + " + " + num1;
                        pairs.add(pair);
                    }
                });

        if (!pairs.isEmpty()) {
            System.out.println("Pairs with sum " + targetSum + ":");
            pairs.forEach(System.out::println);
        } else {
            System.out.println("No pairs found with sum " + targetSum);
        }

        Map<Integer, User> userMap
                = Arrays.asList(user1, user2, user3)
                .stream()

                .collect(Collectors.toMap(user -> user.getUserId(), user -> user));
    }
}
*/
