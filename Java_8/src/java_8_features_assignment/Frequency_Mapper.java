package java_8_features_assignment;


import java.util.*;
import java.util.stream.*;

public class Frequency_Mapper {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "Alice", "Bob", "Alice", "Bob", "Carol");
        Map<String, Long> freq = names.stream()
            .collect(Collectors.groupingBy(name -> name, Collectors.counting()));
        System.out.println(freq);
    }
}
