package java_8_features_assignment;


import java.util.Optional;

public class Safe_Divider {
    public static Optional<Double> divide(int a, int b) {
        if (b == 0) {
            return Optional.empty();
        }
        return Optional.of((double)a / b);
    }

    public static void main(String[] args) {
        System.out.println(divide(12, 2).orElse(Double.NaN));
        System.out.println(divide(10, 0).orElse(Double.NaN));
    }
}



