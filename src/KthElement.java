import java.util.PriorityQueue;

public class KthElement {
    public int findKthLargest(int[] nums, int k) {
        // Create a min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Push first k elements into the min heap
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }

        // Iterate through the remaining elements
        for (int i = k; i < nums.length; i++) {
            // If current element is larger than the smallest element in min heap
            if (nums[i] > minHeap.peek()) {
                // Replace the smallest element with the current element
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }

        // After iterating through all elements, the root of min heap is the kth largest
        return minHeap.peek();
    }

    public static void main(String[] args) {
        KthElement solution = new KthElement();

        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println(solution.findKthLargest(nums1, k1)); // Output: 5

        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        System.out.println(solution.findKthLargest(nums2, k2)); // Output: 4
    }
}
