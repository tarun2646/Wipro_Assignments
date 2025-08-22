package java_8_features_assignment;

import java.util.*;

public class Simple_name_sorter  {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob marlie", "Even", "Charlie");
        names.sort((a, b) -> a.compareTo(b));
        System.out.println(names);
    }
}


