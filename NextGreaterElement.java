import java.util.Stack;

public class NextGreaterElement 
{
    public static long[] nextLargerElement(long[] arr, int n) { 
        Stack<Integer> stack = new Stack<>();
        long ans[] = new long[n];
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            ans[stack.pop()] = -1;
        }
        
        return ans;
    } 

    public static void main(String[] args) 
    {
        Stack<Integer> a = new Stack<>();
        int n = 4;
        int arr[] = {1, 3, 2, 4};
        
    }

}
