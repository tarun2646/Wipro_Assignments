package java_8_features_assignment;

import java.util.*;
import java.util.stream.*;

public class Name_Filter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Even", "Adam", "Boby");
        List<String> filtered = names.stream()
            .filter(name -> name.startsWith("A"))
            .collect(Collectors.toList());
        System.out.println(filtered);
    }
}

