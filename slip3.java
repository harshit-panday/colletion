import java.util.*;

public class slip3 {

    public static void main(String[] args) {

        // Create a LinkedList of String objects
        LinkedList<String> linkedList = new LinkedList<>();
       
        // Add elements to the end of the list
        linkedList.add("Hello");
        linkedList.add("World!");

        // Delete the first element of the list
        linkedList.removeFirst();

        // Display the contents of the list in reverse order
        Iterator<String> iterator = linkedList.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
