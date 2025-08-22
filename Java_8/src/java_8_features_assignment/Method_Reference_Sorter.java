package java_8_features_assignment;

import java.util.*;

public class Method_Reference_Sorter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
        names.sort(String::compareTo);
        System.out.println(names);
    }
}


