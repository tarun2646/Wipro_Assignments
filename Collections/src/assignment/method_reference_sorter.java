package assignment;
import java.util.*;

public class method_reference_sorter
{
    public static void main (String[] args)
    {
        List<String> names = Arrays.asList("Tarun", "Amit", "Ravi", "John", "Zara");

        // Sorting using method reference instead of lambda
        Collections.sort(names, String::compareToIgnoreCase);

        System.out.println("Sorted List" + names);
       }
}

