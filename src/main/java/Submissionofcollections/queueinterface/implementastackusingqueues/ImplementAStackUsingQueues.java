package Submissionofcollections.queueinterface.implementastackusingqueues;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push operation
    public void push(int x) {
        queue1.offer(x);
    }

    // Pop operation
    public int pop() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        // Transfer all elements except the last one to queue2
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        // The last element in queue1 is the top of the stack
        int top = queue1.poll();
        // Swap the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return top;
    }

    // Top operation
    public int top() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        // Transfer all elements except the last one to queue2
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        // The last element in queue1 is the top of the stack
        int top = queue1.peek();
        // Move the last element to queue2
        queue2.offer(queue1.poll());
        // Swap the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return top;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}
