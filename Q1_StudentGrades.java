import java.util.Scanner;

public class Q1_StudentGrades {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int a = 0, b = 0, c = 0, d = 0, f = 0;
        int sum = 0;

        System.out.println("Enter marks:");

        for (int i = 0; i < n; i++) {
            int marks = sc.nextInt();

            sum += marks;

            if (marks >= 90) {
                System.out.print("A ");
                a++;
            }
            else if (marks >= 80) {
                System.out.print("B ");
                b++;
            }
            else if (marks >= 70) {
                System.out.print("C ");
                c++;
            }
            else if (marks >= 60) {
                System.out.print("D ");
                d++;
            }
            else {
                System.out.print("F ");
                f++;
            }
        }

        double average = (double) sum / n;

        System.out.println("\nA = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        System.out.println("F = " + f);

        System.out.println("Average = " + average);
    }
}
