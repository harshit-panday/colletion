
import java.util.*;

public class slip4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> city= new HashMap<String,String>();

        city.put("mumbai", "022");
        city.put("delhi", "011");
        city.put("kolkata", "033");
        city.put("chennai", "044");

        System.out.println("Original HashMap: " + city);

        System.out.print("Enter a city name to add: ");
        String citynew = sc.nextLine();
        System.out.print("Enter the STD code for");
        String codenew = sc.nextLine();
        city.put(citynew, codenew);
        System.out.println("Updated HashMap: " + city);

        System.out.print("Enter a city name to remove: ");
        String cityremove = sc.nextLine();
        city.remove(cityremove);
    
        System.out.println("Updated HashMap: " + city);

        System.out.print("Enter a city name to search: ");
        String citySearch = sc.nextLine();
        if (city.containsKey(citySearch)) {
            String codefound = city.get(citySearch);
            System.out.println("STD code for " + citySearch + " is " + codefound + ".");
        } else {
            System.out.println("City not found in the HashMap.");
        }

        sc.close();
    }
}