import java.util.Scanner;

public class Q5_SecondLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        int[] attendance = new int[7];

        int present = 0;
        int absent = 0;

        System.out.println("Enter attendance for 7 days (0 = Absent, 1 = Present):");

        for (int i = 0; i < 7; i++) {

            attendance[i] = sc.nextInt();

            if (attendance[i] != 0 && attendance[i] != 1) {
                System.out.println("Invalid Attendance Input");
                return;
            }

            if (attendance[i] == 1) {
                present++;
            }
            else {
                absent++;
            }
        }

        double percentage = (present / 7.0) * 100;

        System.out.println("Employee ID = " + id);
        System.out.println("Employee Name = " + name);
        System.out.printf("Attendance = %.2f%%%n", percentage);
        System.out.println("Absent Days = " + absent);

        if (percentage >= 90) {
            System.out.println("Eligible");
        }
        else {
            System.out.println("Not Eligible");
        }
    }
}
