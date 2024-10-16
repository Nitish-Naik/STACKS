import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class Template {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            PrintWriter p = new PrintWriter(new File("output.txt"));
            int n = sc.nextInt();
            int a[] = new int[n];

            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }

            p.print(Arrays.toString(a));
            p.flush();
            p.close();
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
