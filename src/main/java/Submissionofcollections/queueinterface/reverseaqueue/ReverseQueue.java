package Submissionofcollections.queueinterface.reverseaqueue.reverseaqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Dequeue all elements from the queue and push them onto the stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Pop all elements from the stack and enqueue them back to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}
