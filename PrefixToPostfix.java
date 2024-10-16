import java.io.PrintWriter;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class PrefixToPostfix {
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
            Scanner sc = new Scanner(new File("input.txt"));
            PrintWriter p = new PrintWriter(new File("output.txt"));
            String prefix = sc.nextLine();
            Stack<String> s = new Stack<>();
            for(int i=prefix.length()-1; i>=0; i--) {
                char ch = prefix.charAt(i);
                if(isOperator(ch)) {
                    String op1 = s.pop();
                    String op2 = s.pop();
                    String temp = op1 + op2 + ch ;

                    s.push(temp);
                }
                else {
                    s.push(ch+"");
                }
            }
            String postfix = s.pop();
            p.println(postfix);
            p.flush();
            p.close();
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
