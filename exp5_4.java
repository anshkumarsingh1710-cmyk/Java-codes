import java.util.*;

interface Payment {
    void pay();
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Payment Successful");
    }
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment Successful");
    }
}

class DebitCard implements Payment {
    public void pay() {
        System.out.println("Payment Successful");
    }
}

class NetBanking implements Payment {
    public void pay() {
        System.out.println("Payment Successful");
    }
}

public class exp5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mode = sc.nextLine();
        Payment p;

        switch (mode.toLowerCase()) {
            case "upi":
                p = new UPI();
                break;

            case "credit card":
                p = new CreditCard();
                break;

            case "debit card":
                p = new DebitCard();
                break;

            case "net banking":
                p = new NetBanking();
                break;

            default:
                System.out.println("Invalid Payment Mode");
                return;
        }

        p.pay();
    }
}