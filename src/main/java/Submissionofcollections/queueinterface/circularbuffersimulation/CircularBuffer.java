package Submissionofcollections.queueinterface.circularbuffersimulation;

import java.util.LinkedList;
import java.util.Queue;

class CircularBuffer {
    private Queue<Integer> buffer;
    private int capacity;

    public CircularBuffer(int size) {
        buffer = new LinkedList<>();
        capacity = size;
    }

    // Insert an element into the buffer
    public void insert(int element) {
        if (buffer.size() == capacity) {
            // Buffer is full, remove the oldest element
            buffer.poll();
        }
        buffer.offer(element);
    }

    // Get the elements in the buffer
    public Integer[] getBuffer() {
        return buffer.toArray(new Integer[0]);
    }

    // Print the buffer for demonstration
    public void printBuffer() {
        for (Integer element : buffer) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.printBuffer(); // Output: 1 2 3

        cb.insert(4);
        cb.printBuffer(); // Output: 2 3 4

        cb.insert(5);
        cb.printBuffer(); // Output: 3 4 5
    }
}
