import java.util.*;
public class sort012s {
    // Function to sort an array of 0s, 1s, and 2s
    public static ArrayList<Integer> sort012(ArrayList<Integer> arr) { // line 3 <- error on this line, see below for error message
        // code here
        
        int low = 0;
        int mid=0;
        int high = arr.size()-1;
        
        while(mid <= high) {
            if(arr.get(mid) == 0) {
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                low++;
                mid++;
            }
            else if(arr.get(mid) == 1) {
                mid++;
            }
            
            else {
                int temp = arr.get(high);
                arr.set(high, arr.get(mid));
                arr.set(mid, temp);
                high--;
            }
        }
        return arr;
    }
    public static void main(String args[]) {
      ArrayList<Integer> cars = new ArrayList<Integer>();

// Add items to the ArrayList
      cars.add(0);
      cars.add(2);
      cars.add(1);
      cars.add(2);
      cars.add(0);
      cars.add(2);
      cars.add(1);
      cars.add(0);
      cars.add(0);
      cars.add(2);
      cars.add(1);
      System.out.println(sort012(cars));
    }
}