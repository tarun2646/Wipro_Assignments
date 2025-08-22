package java_8_features_assignment;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Custom_Filter_Chain {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amy", "Alex", "Bob", "Anna", "Arthur");
        Predicate<String> startsWithA = name -> name.startsWith("A");
        Predicate<String> lengthIs4 = name -> name.length() == 4;
        List<String> filtered = names.stream()
            .filter(startsWithA.and(lengthIs4))
            .collect(Collectors.toList());
        System.out.println(filtered);
    }
}


