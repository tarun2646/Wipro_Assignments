package assignment;
import java.util.*;
import java.util.stream.Collectors;

public class name_finder {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Charlie", "Aman", "David");

        List<String> aNames = names.stream()
                                   .filter(name -> name.startsWith("A"))
                                   .collect(Collectors.toList());
	
        System.out.println("Names starting with A " + aNames);
	}
}

	



