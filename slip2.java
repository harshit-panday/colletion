import java.util.*;

public class slip2 {

    public static void main(String[] args) {

        // Create a HashSet to store the names of friends
        HashSet<String> friends = new HashSet<>();

        // Read the number of friends from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of friends: ");
        int n = scanner.nextInt();

        // Read the names of friends from the user
        System.out.println("Enter the names of your friends: ");
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            friends.add(name);
        }

        // Convert the HashSet to an ArrayList to sort the names
        ArrayList<String> sortedFriends = new ArrayList<>(friends);
        Collections.sort(sortedFriends);

        // Display the names in ascending order
        System.out.println("The names of your friends in ascending order are: ");
        for (String friend : sortedFriends) {
            System.out.println(friend);
        }
    }
}