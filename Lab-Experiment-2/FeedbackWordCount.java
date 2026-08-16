import java.util.Scanner;

public class FeedbackWordCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Feedback Message: ");
        String feedback = sc.nextLine();

        if (feedback.isEmpty()) {
            System.out.println("Invalid Feedback Message");
        } 
        else {
            String[] words = feedback.trim().split("\\s+");

            System.out.println("Words = " + words.length);
        }

        sc.close();
    }
}
