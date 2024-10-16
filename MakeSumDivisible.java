import java.util.*;

public class MakeSumDivisible {
    public static void main(String[] args) {
        
        int nums[] = {6,3,5,2}, p = 9;
        List<List<Integer>> t = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++) {
            List<Integer> a = new ArrayList<>();
            for(int j=i; j<n; j++) {
                a.add(nums[j]);
            }
            t.add(a);
            int sum = 0;
            for(int e: a) {
                sum += e;
            }
            if(sum % p == 0) {
                System.out.println(nums.length - a.size()-1);
            }
        }
        System.out.println(t);
    }
}

// Output: 1