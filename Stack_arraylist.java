// Peek(), Pop(), push()
// Implemented using arrays, arrayslist, linkedlist

import java.util.ArrayList;

public class Stack_arraylist 
{
    static class Stack 
    {
        static ArrayList<Integer> list  = new ArrayList<>(5);
        //    isEmpty()
        static boolean isEmpty()
        {
            return list.size() == 0;
        }
        //    push()
        public static void push(int data)
        {
            list.add(data);
            return;
        }

        // pop()
        public static void pop()
        {
            if(list.size() == 0)
            {
                System.out.println("stack is empty ==  ");
                return;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return;
        }

        // peek
        public static int peek()
        {
            if(list.size() == 0)
            {
                System.out.print("Stack is empty ==  ");
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) 
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()) 
        {
            System.out.println(s.peek());  
            s.pop();
        }
    }    
}