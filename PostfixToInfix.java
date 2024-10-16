import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.*;;

public class PostfixToInfix {
    public static boolean isOperator(char ch) {
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
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            PrintWriter p = new PrintWriter(new File("output.txt"));
            Stack<String> s = new Stack<>();
            String str = sc.nextLine();
            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                if(!isOperator(ch)) {
                    s.push(ch + "");
                }
            
                else {
                    String op1= s.pop();
                    String op2= s.pop();
                    String temp  = "(" + op2+ ch + op1+")";
                    s.push(temp);

                }
            }


            p.write(s.pop());
            p.flush();
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}