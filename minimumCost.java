import java.util.PriorityQueue;

public class minimumCost {

    public static long minCost(long[] arr) {
        // Use a priority queue to always retrieve the smallest elements first
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        
        // Add all elements to the priority queue
        for (long num : arr) {
            minHeap.add(num);
        }
        
        long minSum = 0;
        
        // Combine the smallest two elements until only one element is left
        while (minHeap.size() > 1) {
            long first = minHeap.poll();  // Get and remove the smallest element
            long second = minHeap.poll(); // Get and remove the second smallest element
            
            long sum = first + second;
            minSum += sum;  // Add the combined cost to the total cost
            
            // Add the combined element back to the priority queue
            minHeap.add(sum);
        }
        
        return minSum;
    }
    
    public static void main(String[] args) {
        long arr[] = {4, 3, 2, 6};
        System.out.println(minCost(arr)); // Output the minimum cost
    }
}
