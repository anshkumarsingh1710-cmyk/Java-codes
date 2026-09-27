import java.util.Scanner;

class LowBalanceException extends Exception {

    public LowBalanceException(String message) {
        super(message);
    }
}

public class exp6_4 {

    static void checkBalance(double balance)
            throws LowBalanceException {

        if (balance < 1000) {
            throw new LowBalanceException("LowBalanceException");
        }

        System.out.println("Valid Balance");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        try {
            checkBalance(balance);

        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}