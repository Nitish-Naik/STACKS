import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

/**
 * PrefixToInfix
 */
public class PrefixToInfix {
    private static boolean isOperator(char ch) {
        switch (ch) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '%':
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            // Replace "input.txt" and "output.txt" with your actual file paths
            Scanner sc = new Scanner(new File("input.txt"));
            PrintWriter p = new PrintWriter(new File("output.txt"));

            // Read the prefix expression from the input file
            String prefix = sc.nextLine();
            Stack<String> s = new Stack<>();

            for (int i = prefix.length() - 1; i >= 0; i--) {
                char ch = prefix.charAt(i);

                if (isOperator(ch)) {
                    String op1 = s.pop();
                    String op2 = s.pop();
                    String temp = "(" + op1 + ch + op2 + ")";
                    s.push(temp);
                } else {
                    s.push(ch + "");
                }
            }

            // Output the result to the output file
            String infixExpression = s.pop();
            p.println(infixExpression);
            p.flush();
            p.close(); // Close the PrintWriter after writing
            sc.close(); // Close the Scanner after reading
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
