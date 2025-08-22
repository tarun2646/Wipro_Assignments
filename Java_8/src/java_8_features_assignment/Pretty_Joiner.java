package java_8_features_assignment;

import java.util.*;
import java.util.stream.*;

public class Pretty_Joiner {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Carol");
        String result = names.stream()
            .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}



