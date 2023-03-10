import java.util.Stack;

class MyQueue {
    Stack<Integer> queue;

    public MyQueue() {
        queue = new Stack<Integer>();
    }

    public void push(int x) {
        if (queue.isEmpty()) {
            queue.push(x);
            return;
        }
        int pop = queue.pop();
        push(x);
        queue.push(pop);
    }

    public int pop() {
        return queue.pop();
    }

    public int peek() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */