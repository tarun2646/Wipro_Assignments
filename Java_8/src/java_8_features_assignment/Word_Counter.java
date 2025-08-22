package java_8_features_assignment;

import java.util.*;

public class Word_Counter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Enemies", "Charlie", "Jonathan", "Bob");
        long count = names.stream()
            .filter(name -> name.length() > 5)
            .count();
        System.out.println("Names longer than 5 chars: " + count);
    }
}


