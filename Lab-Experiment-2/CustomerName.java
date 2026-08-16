import java.util.Scanner;

public class CustomerFeedback {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Feedback: ");
        String feedback = sc.nextLine();

        System.out.print("Enter Keyword: ");
        String keyword = sc.nextLine();

        // Validate feedback
        if (feedback.isEmpty()) {
            System.out.println("Invalid Feedback Message");
            sc.close();
            return;
        }

        if (feedback.length() > 500) {
            System.out.println("Feedback Exceeds Maximum Length");
            sc.close();
            return;
        }

        // Count characters
        int characters = feedback.length();

        // Count words
        String[] words = feedback.trim().split("\\s+");
        int wordCount = words.length;

        // Case-insensitive keyword search
        String lowerFeedback = feedback.toLowerCase();
        String lowerKeyword = keyword.toLowerCase();

        int keywordCount = 0;
        int index = 0;

        while ((index = lowerFeedback.indexOf(lowerKeyword, index)) != -1) {
            keywordCount++;
            index += lowerKeyword.length();
        }

        // Display information
        System.out.println();
        System.out.println("--- Feedback Information ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Characters = " + characters);
        System.out.println("Words = " + wordCount);

        if (keywordCount > 0) {
            System.out.println("Keyword Found = " + keywordCount);
        } else {
            System.out.println("Keyword Not Found");
        }

        sc.close();
    }
}
