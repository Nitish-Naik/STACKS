import java.util.*;
public class ParenthesisChecker 
{
    public static boolean isPar(String x)
    {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<x.length(); i++)
        {
            char a = x.charAt(i);
            if(a == '(' || a == '[' || a == '{')
            {
                stack.push(a);
                continue;
            }

            if(stack.isEmpty())
            {
                return false;
            }

            char check;

            switch(a) 
            {
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '[')
                    {
                        return false;
                    }
                    break;
                
                case ']':
                check = stack.pop();
                if(check == '{' || check == '(')
                {
                    return false;
                }
                break;

                case '}':
                    check = stack.pop();
                    if(check == '(' || check == '[')
                    {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) 
    {
        System.out.println(isPar("([{}])"));
    }
}
