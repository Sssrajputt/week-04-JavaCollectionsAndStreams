package Submissionofcollections.queueinterface.reverseaqueue.generatebinarynumbersusingaqueue;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbersUsingAQueue {
    public static Queue<String> convertToBinary(int num) {
        Queue<String> queue = new LinkedList<>();
        for (int i = 1; i <= num; i++) {
            String binary = Integer.toBinaryString(i);
            queue.offer(binary);
        }
        return queue;
    }

    public static void main(String args[]){
        System.out.println("---------------------------");
        Queue<String> queue = convertToBinary(5);
        for (String binary : queue) {
            System.out.print(binary + ",");
        }
        System.out.println();
        System.out.println("---------------------------");
    }
}
