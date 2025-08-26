package assignment;

import java.util.ArrayDeque;

public class last_3_searches  {
    public static void main(String[] args) {
        ArrayDeque<String> searchBox = new ArrayDeque<>();

        addSearch(searchBox, "Java");
        addSearch(searchBox, "Python");
        addSearch(searchBox, "C");
        addSearch(searchBox, "JavaScript");  // This should remove "Java"

        System.out.println("Last 3 Searches: " + searchBox);
    }

    public static void addSearch(ArrayDeque<String> deque, String search) {
        if (deque.size() == 3) {
            deque.removeFirst();  // Remove oldest
        }
        deque.addLast(search);    // Add new search
    }
}