import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            PrintWriter p = new PrintWriter(new File("output.txt"));
            // int n = sc.nextInt();
            int left = 0, right = 0, maxLen = 0;
            int[] hash = new int[256];
            Arrays.fill(hash, -1);
            String s = sc.nextLine();
            while (right < s.length()) {
                if(hash[s.charAt(right)] != -1) {
                    if(hash[s.charAt(right)] >= left) {
                        left = hash[s.charAt(right)] + 1;
                    }
                }
                int len = right-left+1;
                maxLen = Math.max(len, maxLen);
                hash[s.charAt(right)] = right;
                right++;
            }
            p.print(maxLen);
            
            p.println();
            p.print(Arrays.toString(hash));
            p.flush();
            p.close();
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}