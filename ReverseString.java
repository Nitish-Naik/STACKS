import java.util.Stack;
public class ReverseString 
{
    public static void reverseString(String s)
    {
        Stack<Character> a = new Stack<>();
        int idx = 0;
        while(idx < s.length()) 
        {
            a.push(s.charAt(idx));
            idx++;    
        }
        StringBuilder reverse = new StringBuilder("");
        while(!a.isEmpty()) 
        {
            reverse.append(a.pop());
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) 
    {
        String a = "nitish";
        reverseString(a);
    }    
}
