public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 20, 8, 15 };

        int largest = Integer.MIN_VALUE; // Initialize to smallest possible integer value
        int secondLargest = Integer.MIN_VALUE; // Initialize to smallest possible integer value

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                // If the current element is larger than the largest, update secondLargest and largest
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                // If the current element is larger than secondLargest but not equal to largest, update secondLargest
                secondLargest = arr[i];
            }
        }

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element in the array is: " + secondLargest);
        } else {
            System.out.println("There is no second largest element in the array.");
        }
    }
}
