import java.util.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

public class NextGreaterElementII {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            PrintWriter p = new PrintWriter(new File("output.txt"));
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
                // p.print((a[i] + " "));
            }

            Stack<Integer> s = new Stack<>();
            int nge[]= new int[n];
            Arrays.fill(nge, -1);
            for(int i=a.length-1; i>=0; i--) {
                while (s.isEmpty() == false && s.peek() <= a[i]) {
                    s.pop();
                }
                if(i < n-1) {
                    if(s.isEmpty() == false) nge[i] = s.peek();
                    else nge[i] = -1;
                }
                s.push(a[i]);
            }

            for(int i=0; i<n-1; i++) {
                if(a[i] > a[n-1]) {
                    nge[n-1] = a[i];
                    break;
                }
            }
            p.println("Output");
            for(int i=0; i<nge.length; i++) {
                p.print(nge[i] + " ");
            }
            p.flush();
            p.close();
            sc.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
