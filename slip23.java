import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class slip23 {
    public static void main(String[] args) {
        // Accept student names through command line arguments
        List<String> studentNames = new ArrayList<>();
        for (String arg : args) {
            studentNames.add(arg);
        }

        // Display student names using Iterator
        System.out.println("Student names using Iterator:");
        Iterator<String> iterator = studentNames.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Display student names using ListIterator
        System.out.println("\nStudent names using ListIterator:");
        ListIterator<String> listIterator = studentNames.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
