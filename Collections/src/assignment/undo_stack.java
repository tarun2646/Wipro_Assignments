package assignment;
import java.util.Stack;

public class undo_stack {
    public static void main(String[] args) {
        Stack<String> commandStack = new Stack<>();
        Stack<String> redoStack = new Stack<>();

        // Add commands
        commandStack.push("Open");
        commandStack.push("Edit");
        commandStack.push("Save");

        System.out.println("Commands: " + commandStack);

        // Undo last command
        String undone = commandStack.pop();
        redoStack.push(undone);

        System.out.println("After Undo: " + commandStack);

        // Redo last undone command
        commandStack.push(redoStack.pop());

        System.out.println("After Redo: " + commandStack);
    }
}



