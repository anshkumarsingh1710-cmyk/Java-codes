import java.util.Scanner;

public class ZomatoRestaurantApp {
    public static void main(String[] args) {

        String[] restaurants = new String[10];

        restaurants[0] = "A2B";
        restaurants[1] = "Barbeque Nation";
        restaurants[2] = "Empire";
        restaurants[3] = "Meghana Foods";
        restaurants[4] = "Burger King";

        int totalRestaurants = 5;

        System.out.println("--- Available Restaurants List ---");

        String longestName = restaurants[0];

        for (int i = 0; i < totalRestaurants; i++) {

            // Print restaurant name
            System.out.println(restaurants[i]);

            // Find longest restaurant name
            if (restaurants[i].length() > longestName.length()) {
                longestName = restaurants[i];
            }
        }

        System.out.println("--------------------------");
        System.out.println("Longest Name = " + longestName);
        System.out.println("--------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter restaurant name to search:");
        String searchKey = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < totalRestaurants; i++) {
            if (restaurants[i].equalsIgnoreCase(searchKey)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Restaurant Found");
        } else {
            System.out.println("Restaurant Not Found");
        }

        scanner.close();
    }
}