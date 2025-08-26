package assignment;
import java.util.*;

class Patient {
    String name;
    int severity;
    long timestamp;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
        this.timestamp = System.currentTimeMillis();
    }

    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class emergency_patient_tracker {
    public static void main(String[] args) throws InterruptedException {
        PriorityQueue<Patient> queue = new PriorityQueue<>(5, (p1, p2) -> {
            if (p1.severity != p2.severity) {
                return Integer.compare(p1.severity, p2.severity); // lower severity = higher priority
            } else {
                return Long.compare(p1.timestamp, p2.timestamp); // older = higher priority
            }
        });

        // Add 5 patients
        addPatient(queue, new Patient("tarun", 6));
        Thread.sleep(10);
        addPatient(queue, new Patient("Bob", 2));
        Thread.sleep(10);
        addPatient(queue, new Patient("Charlie", 2));
        Thread.sleep(10);
        addPatient(queue, new Patient("Diana", 1));
        Thread.sleep(10);
        addPatient(queue, new Patient("Eve", 4));

        System.out.println("\nTreating patients:");
        while (!queue.isEmpty()) {
            System.out.println("Treated: " + queue.poll());
        }
    }

    public static void addPatient(PriorityQueue<Patient> queue, Patient patient) {
        if (queue.size() < 5) {
            queue.offer(patient);
            System.out.println("Added: " + patient);
        } else {
            System.out.println("Queue full. Skipping: " + patient.name);
        }
    }
}

