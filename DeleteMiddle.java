import java.util.*;

public class DeleteMiddle {
    // Function to delete middle element of a stack.
    public static void deleteMid(Stack<Integer> s, int sizeOfStack) {
        // code here
        if (sizeOfStack <= 1) {
            return; // No middle element to delete
        }
        delete(s, 0, sizeOfStack);
        System.out.println(s);
    }

    private static void delete(Stack<Integer> s, int i, int sizeOfStack) {
        if(s.isEmpty() || i == sizeOfStack)
        {
            return;
        }

        int top = s.pop();
        delete(s, i+1, sizeOfStack);

        if(i != sizeOfStack/2)
        {
            s.push(top);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        // s.push(50);
        System.out.println(s);
        deleteMid(s, 4);
    }
}
