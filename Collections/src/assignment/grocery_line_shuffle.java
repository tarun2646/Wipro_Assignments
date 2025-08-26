package assignment;
import java.util.ArrayDeque;

public class grocery_line_shuffle {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();

        enterQueue(queue, "tarun");       // Odd length → end
        enterQueue(queue, "tejas");      // Even length → front
        enterQueue(queue, "tej");      // Even → front
        enterQueue(queue, "vayu");       // Odd → end

        System.out.println("Queue Order: " + queue);
    }

    public static void enterQueue(ArrayDeque<String> queue, String name) {
        if (name.length() % 2 == 0) {
            queue.addFirst(name);  // Even length → front
        } else {
            queue.addLast(name);   // Odd length → end
        }
    }
}
