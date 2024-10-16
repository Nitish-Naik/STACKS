class CustomQueue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;
    
    public CustomQueue(int capacity) {
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    // Enqueue operation
    public void enqueue(int data) {
        if (size == queueArray.length) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % queueArray.length;
        queueArray[rear] = data;
        size++;
    }
    
    // Dequeue operation
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int frontElement = queueArray[front];
        front = (front + 1) % queueArray.length;
        size--;
        return frontElement;
    }
    
    // Peek operation
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queueArray[front];
    }
    
    public int getSize() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == queueArray.length;
    }
}

public class CustomQueueExample {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        System.out.println("Front element: " + queue.peek());
        
        queue.dequeue();
        
        System.out.println("Front element after dequeue: " + queue.peek());
        
    }
}
