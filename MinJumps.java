/**
 * MinJumps
 */
public class MinJumps {
        static int minJumps(int[] arr) {
            if (arr == null || arr.length == 0 ) {
                return -1; // If the array is empty or the first element is 0, can't reach the end
            }
            
            if (arr.length == 1) {
                return 0; // If there's only one element, no jumps are needed as we're already at the end
            }
    
            int n = arr.length;
            int jumps = 0;
            int currentEnd = 0;
            int farthest = 0;
    
            for (int i = 0; i < n - 1; i++) {
                farthest = Math.max(farthest, i + arr[i]);
                if (i == currentEnd) {
                    jumps++;
                    currentEnd = farthest;
                }
            }
    
            return (currentEnd >= n - 1) ? jumps : -1;
        }
    public static void main(String[] args) {class Solution {
    static int minJumps(int[] arr) {
        if (arr == null || arr.length == 0 ) {
            return -1; // If the array is empty or the first element is 0, can't reach the end
        }
        
        if (arr.length == 1) {
            return 0; // If there's only one element, no jumps are needed as we're already at the end
        }

        int n = arr.length;
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return (currentEnd >= n - 1) ? jumps : -1;
    }
}
        int a[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        // System.out.println(minJumps(a));
        System.out.println(3%5);
    }
}