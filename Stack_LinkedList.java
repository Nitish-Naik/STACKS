// Arrays, linkedlist are used mostly because of dynamic size
// in linkedList top == head -> because it satisfies all the requirements of stack

public class Stack_LinkedList 
{
    static class Node 
    {
        int data;
        Node next;
        
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }   
    }

    static class Stack 
    {
        public static Node head = null;
        public static Node tail;
        public static int size;
        // isEmpty
        public static boolean isEmpty()
        {
            return head == null;
        }
        // push
        public static void push(int data)
        {
            Node newNode = new Node(data);
            if(head == null)
            {
                head = tail = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
            return;
        }
        // pop
        public static void pop()
        {
            if(head == null)
            {
                System.out.println("Stack is empty");
                return;
            }
            int top = head.data;
            head = head.next;
            // System.out.println(top);
            return;
        }
        // peek
        public static void peek()
        {
            if(head == null)
            {
                System.out.println("Stack is empty");
                return;
            }
            System.out.println(head.data);
            return;
        }
    }
    public static void main(String[] args) 
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.isEmpty());
        while(!s.isEmpty()) 
        {
            s.peek();  
            s.pop();
        }   
    }    
}
