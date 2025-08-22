package java_8_features_assignment;

import java.util.*;

public class Parallel_Square_Printer {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        nums.parallelStream()
            .forEach(n -> System.out.println(n + "^2 = " + (n*n)));
    }
}


