package assignment;
import java.util.concurrent.LinkedBlockingQueue;

public class chat_processor {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> messageQueue = new LinkedBlockingQueue<>(5);

        // Writer thread: adds messages
        Thread writer = new Thread(() -> {
            int count = 1;
            try {
                while (true) {
                    String msg = "Message " + count++;
                    messageQueue.put(msg);  // waits if full
                    System.out.println("Added: " + msg);
                    Thread.sleep(50); // simulate delay
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Reader thread: consumes messages
        Thread reader = new Thread(() -> {
            try {
                while (true) {
                    String msg = messageQueue.take();  // waits if empty
                    System.out.println("Processed: " + msg);
                    Thread.sleep(100); // simulate processing time
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        writer.start();
        reader.start();
    }
}

