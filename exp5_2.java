import java.util.*;

class Price {
    void calculate(double price) {
        System.out.println("Original Price = " + price);
    }

    void calculate(double price, double discount) {
        if (price <= 0 || discount < 0 || discount > 100) {
            System.out.println("Invalid Product Price");
            return;
        }

        double finalPrice = price - (price * discount / 100);
        System.out.println("Final Price = " + finalPrice);
    }
}

public class exp5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();
        double discount = sc.nextDouble();

        Price p = new Price();
        p.calculate(price);
        p.calculate(price, discount);
    }
}