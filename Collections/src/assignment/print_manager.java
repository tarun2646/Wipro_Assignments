package assignment;
import java.util.concurrent.ArrayBlockingQueue;

public class print_manager {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> printQueue = new ArrayBlockingQueue<>(3);

        addPrintJob(printQueue, "Job1");
        addPrintJob(printQueue, "Job2");
        addPrintJob(printQueue, "Job3");
        addPrintJob(printQueue, "Job4"); // This should be skipped (queue full)
        addPrintJob(printQueue, "Job4");
        // Print jobs one by one
        while (!printQueue.isEmpty()) {
            String job = printQueue.poll();
            System.out.println("Printing: " + job);
        }
    }

    public static void addPrintJob(ArrayBlockingQueue<String> queue, String job) {
        if (!queue.offer(job)) {
            System.out.println("Queue full. Skipping: " + job);
        }
    }
}

