import java.util.Scanner;

public class Q2_ArrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        try {
            System.out.println("Element: " + arr[index]);
            System.out.println("Element Displayed Successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        sc.close();
    }
}