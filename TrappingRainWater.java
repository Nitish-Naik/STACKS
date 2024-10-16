import java.util.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class TrappingRainWater {

    public static long trappingWater(int height[]) {
        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        long waterTrapped = 0;

        // Fill leftMax array
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // Fill rightMax array
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        // Calculate total trapped water
        for(int i=0; i<n; i++) {
            waterTrapped += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        System.out.println(Arrays.toString(leftMax));
        System.out.println(Arrays.toString(rightMax));
        return waterTrapped;
    }

    public static void main(String[] args) {
            try {
                Scanner sc = new Scanner(new File("input.txt"));
                PrintWriter p = new PrintWriter(new File("output.txt"));
                int n = sc.nextInt();
                int a[] = new int[n];
                for(int i=0; i<n; i++) {
                    a[i] = sc.nextInt();
                }


                long water = trappingWater(a);
                p.print(water);

                p.flush();
                p.close();
                sc.close();
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
    }
}
