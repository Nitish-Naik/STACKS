

public class MissingAndRepeating {
    public static int[] findTwoElement(int arr[]) {
        int n = arr.length;
        int[] a = new int[2];  // To store the repeating and missing elements
        int[] hash = new int[n + 1];  // Since the numbers are from 1 to n
        
        // Count the frequency of each element in the array
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        
        // Identify the repeating and missing elements
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2) {
                a[0] = i;  // Repeating element
            } else if (hash[i] == 0) {
                a[1] = i;  // Missing element
            }
        }
        
        return a;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 3};  // Example input
        int a[] = findTwoElement(arr);
        System.out.println("Repeating: " + a[0]);
        System.out.println("Missing: " + a[1]);
    }   
}
