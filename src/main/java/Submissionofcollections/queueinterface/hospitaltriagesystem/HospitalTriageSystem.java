package Submissionofcollections.queueinterface.hospitaltriagesystem;
import java.util.PriorityQueue;
import java.util.Queue;

class Patient implements Comparable<Patient> {
    public String name;
    int priority;

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.priority, this.priority); // Higher priority first
    }
}

public class HospitalTriageSystem {

    public static Queue<Patient> getPriorityQueue() {
        Queue<Patient> queue = new PriorityQueue<>();
        queue.offer(new Patient("John", 3));
        queue.offer(new Patient("Alice", 5));
        queue.offer(new Patient("Bob", 2));
        return queue;
    }

    public static void main(String[] args) {
        Queue<Patient> queue = getPriorityQueue();
        while (!queue.isEmpty()) {
            Patient patient = queue.poll();
            System.out.println("Treating patient: " + patient.name + " with priority: " + patient.priority);
        }
    }
}
