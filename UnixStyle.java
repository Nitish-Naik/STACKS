import java.util.Stack;

public class UnixStyle
{
    public static String simplifyPath(String path) {
        String dirs[] = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String dir : dirs) {
            if (dir.equals("") || dir.equals(".")) {
                continue;
            } else if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(dir);
            }
        }

        StringBuilder sb = new StringBuilder("");
        if(stack.isEmpty())
        {
            sb.append("/");
            return sb.toString();
        }
        else
        {
            while(!stack.isEmpty())
            {
                sb.insert(0, "/" + stack.pop());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // String path = "////home////.....////foo";
        String path = "/.../a/../b/c/../d/./";
        System.out.println(simplifyPath(path));
    }
}
