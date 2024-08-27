import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

class MaximumDifference {
    public static int findMaxDiff(int[] arr) {
        // Calculate left and right smaller elements
        int leftSmaller[] = leftSmaller(arr);
        int rightSmaller[] = rightSmaller(arr);

        // Calculate maximum absolute difference
        int maxDiff = 0;
        for (int i = 0; i < arr.length; i++) {
            int diff = Math.abs(leftSmaller[i] - rightSmaller[i]);
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff;
    }

    private static int[] rightSmaller(int[] a) {
        int[] rightSmaller = new int[a.length];
        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = a.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= a[i]) {
                stack.pop();
            }

            rightSmaller[i] = stack.isEmpty() ? 0 : stack.peek();
            stack.push(a[i]);
        }

        return rightSmaller;
    }

    private static int[] leftSmaller(int[] a) {
        int[] leftSmaller = new int[a.length];
        Stack<Integer> stack = new Stack<>();

        // Traverse from left to right
        for (int i = 0; i < a.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= a[i]) {
                stack.pop();
            }

            leftSmaller[i] = stack.isEmpty() ? 0 : stack.peek();
            stack.push(a[i]);
        }

        return leftSmaller;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try (Scanner ip = new Scanner(inputFile);
             PrintWriter op = new PrintWriter(outputFile)) {
            int x = ip.nextInt();
            int[] a = new int[x];

            for (int i = 0; i < x; i++) {
                a[i] = ip.nextInt();
            }

            op.println(findMaxDiff(a));
        }
    }
}
