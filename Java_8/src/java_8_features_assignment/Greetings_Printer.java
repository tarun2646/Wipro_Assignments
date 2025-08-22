package java_8_features_assignment;

@FunctionalInterface
interface Printer {
    void print(String message);
}

public class Greetings_Printer {
    public static void greet(String name, Printer printer) {
        printer.print("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greet("Tarun", msg -> System.out.println(msg));
    }
}



