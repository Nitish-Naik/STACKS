import java.util.*;

class rotateAndDelete {
    public static int rotateDelete(ArrayList<Integer> arr) {
        int i = 0;

        while (arr.size() > 1) {
            // Rotate: move the last element to the front
            int last = arr.remove(arr.size() - 1);
            arr.add(0, last);
            System.out.println("After rotation " + i + ": " + arr);

            // Delete the i-th element from the end, or the last element if index exceeds bounds
            int deleteIndex = arr.size() - 1 - i;
            if (deleteIndex >= 0) {
                arr.remove(deleteIndex);
            } else {
                arr.remove(arr.size() - 1);
            }
            System.out.println("After deletion " + i + ": " + arr);

            i++;
        }

        return arr.get(0); // Return the last remaining element
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("Final remaining element: " + rotateDelete(a));
    }
}
