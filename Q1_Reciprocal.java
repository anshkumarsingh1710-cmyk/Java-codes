import java.util.Scanner;

public class Q1_Reciprocal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        try {
            if (n == 0) {
                throw new ArithmeticException();
            }

            double reciprocal = 1.0 / n;
            System.out.println("Reciprocal = " + reciprocal);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

        sc.close();
    }
}